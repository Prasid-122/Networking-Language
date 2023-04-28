/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocketExample;

import java.io.IOException;
import java.net.*;

/**
 *
 * @author Prasid
 */
public class SocketDemo {
    public static void main(String[] args) throws IOException {
        try {
//              Socket sc  = new Socket();
//        SocketAddress address = new InetSocketAddress("s1.yahoo.com",2222);
//        sc.connect(address);//Connection request send
//        sc.close();
        
        
        Socket sc2 = new Socket("localhost",3333);
        SocketAddress scAddress  = sc2.getRemoteSocketAddress();
            System.out.println(scAddress);
            
            //new socket
            Socket sc3 = new Socket();
            sc3.connect(scAddress);
            
        
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
