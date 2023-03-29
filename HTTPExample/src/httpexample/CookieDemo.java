
package httpexample;

import java.io.IOException;
import java.net.*;
import java.util.*;


public class CookieDemo {
    public static void main(String[] args) throws MalformedURLException, IOException {
        CookieManager manager = new CookieManager();
        manager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
        
        CookieHandler.setDefault(manager);
        
        URL url =new URL ("https://youtube.com");
        URLConnection conn = url.openConnection();
        conn.getContent();
        
        CookieStore storeCookie = manager.getCookieStore();
        List<HttpCookie> cookies =storeCookie.getCookies();
       
        for(HttpCookie c:cookies){
        System.out.println("Domain"+ c.getDomain());
            System.out.println("max age" +c.getMaxAge());
            System.out.println("name of cookie" +c.getName());
            System.out.println("Value of cookies" +c.getValue());
            System.out.println("version" +c.getVersion());
    }
    }
    
}
