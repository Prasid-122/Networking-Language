
package network;

import java.util.Scanner;
import java.net.*;


public class URLEncodingDemo {
    public static void main(String[] args) throws MalformedURLException {
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter the query");
//        String a= sc.nextLine();
//        String url = "https:\\www.google.com"+a;
//        
//        System.out.println("Original url \n"+url+a);
//        String encoderdUrl= URLEncoder.encode(url+a);
//        
//        String eq = URLEncoder.encode(a);
//        System.out.println(url+eq);
        
//        String url2="https://www.abc.com?name=ram&city=ktm&a=what is network programming?";
//        
//        URL u =new URL(url2);
//        String o = u.getProtocol()+"://";
//        o+=u.getAuthority();
//        o+="name="+URLEncoder.encode("ram"+"&");
//        o+="city="+URLEncoder.encode("ktm"+"&");
//        o+="q="+URLEncoder.encode("what is network programming?"+"&");
//        System.out.println(o);
        
        
        //decoder
        System.out.println(URLDecoder.decode("https://www.google.com/search?q=what+is+network+programming%3F&sxsrf=AJOqlzX8ubTanXC7PiL4e6zkwQ68Oda2vQ%3A1679447949707&ei=jVcaZNnpKqicseMPg5yM0A0&ved=0ahUKEwiZ5NeTr-79AhUoTmwGHQMOA9oQ4dUDCA8&uact=5&oq=what+is+network+programming%3F&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBggAEBYQHjIGCAAQFhAeMgYIABAWEB4yBggAEBYQHjIGCAAQFhAeMggIABAWEB4QDzoKCAAQRxDWBBCwAzoHCAAQsAMQQ0oECEEYAFCpBVipBWDPGmgBcAF4AIAB8gGIAfIBkgEDMi0xmAEAoAEByAEKwAEB&sclient=gws-wiz-serp"));
        
    }
}
