
package network;

import java.net.*;


public class URLException {
    public class UrlDemo {
    public static void main(String[]args) throws MalformedURLException{
        URL url1=new URL("http://www.asmt.edu.np:80/style/abc.css");
        URL url2=new URL("http","www.asmt.edu.np","/style/abc.css");
        URL url3=new URL("http","www.asmt.edu.np",80,"/style/abc.css");
       
        URL a=new URL("http://google.com");
        URL b=new URL("http://www.google.com");
       
        System.out.println(a.equals(b));
       
        System.out.println("The giiven url are"+(url2.equals(url3)));
       
       
       
        System.out.println(url1);
        System.out.println(url2);
        System.out.println(url3);
       
        //http://www.asmt.edu.np/style/abc.css?
       URL url=new URL("http://www.asmt.edu.np");
       
       URL rurl=new URL(url,"/style/abc.css");
       
       System.out.println(rurl);
       
       
       System.out.println("Part of the url\n");
       System.out.println(url1.getProtocol());//https
       System.out.println(url1.getAuthority());//www.asmt.edu.np:80
       System.out.println(url1.getHost());//www.asmt.edu.np
       System.out.println(url1.getPort());//80
       System.out.println(url1.getPath());//style/abc.css
       System.out.println(url1.getFile());
       System.out.println(url1.getQuery());
       System.out.println(url1.getRef());
       
       
       
       
       
    }
   
}
    
}
