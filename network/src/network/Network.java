
package network;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class Network {

   
    public static void main(String[] args) {
       
    
        try{
           //getbyName
           InetAddress ip= InetAddress.getByName("192.168.1.1");
           InetAddress ip2 = InetAddress.getByName("www.kbc.edu.np");
           System.out.println(ip2.getHostName());
           System.out.println(ip2.getHostAddress());
           System.out.println(ip.getHostName());
           System.out.println(ip.getHostName());
           //getbyAddress
           byte[] add = {(byte)192, (byte)168,1,1};
           InetAddress ip3 = InetAddress.getByAddress(add);
           InetAddress ip4 = InetAddress.getByAddress("www.kbc.edu.np",add);
           
           System.out.println(ip.getHostName());
           System.out.println(ip2.getHostAddress());
           
           System.out.println(InetAddress.getLocalHost());
           System.out.println(InetAddress.getLoopbackAddress());
           
           InetAddress m1 = InetAddress.getByName("239.0.2.4");
           System.out.println(m1.isMulticastAddress());
           
           
           InetAddress m2 = InetAddress.getByName("190.0.0.0");
           System.out.println(m1.isAnyLocalAddress());
           
           InetAddress m3 = InetAddress.getByName("127.0.0.1");
           
           InetAddress m4 = InetAddress.getByName("::1");
           
           System.out.println(m3.isLoopbackAddress());
           System.out.println(m4.isLoopbackAddress());
           
           InetAddress s1=InetAddress.getByName("FF0E:0000:0000:0000:0000:0000:0000:0000");
           System.out.println(s1.isMCGlobal());
        ////Rechability class
        InetAddress myip2 = InetAddress.getByName("www.kbc.edu.np");
        System.out.println(myip2.isReachable(4000));
        
        Inet4Address ipv4= (Inet4Address) Inet4Address.getByName("192.178.1.1");
        Inet6Address ipv6= (Inet6Address) Inet6Address.getByName("FFE0:1101::");
       }
       catch(UnknownHostException ex){
           System.out.println(ex.getMessage());
       }catch(IOException e){
           
       }
        
        
        
    }
}
