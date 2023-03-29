
package network;


import java.net.*;
import java.util.Enumeration;

public class InterfaceDemo {
    public static void main(String[] args) throws SocketException,UnknownHostException {
        Enumeration<NetworkInterface> ips =NetworkInterface.getNetworkInterfaces();
        while(ips.hasMoreElements()){
            NetworkInterface ip = ips.nextElement();
          
       
        
        System.out.println(ip.getDisplayName());
        }
    }
    
}
