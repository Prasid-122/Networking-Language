/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network;

//import java.net.InetAddress;
//import java.net.UnknownHostException;
//
//public class GetIP {
//   public static void main(String[] args) {
//      try {
//         InetAddress ipAddr = InetAddress.getLocalHost();
//         System.out.println("IP Address:- " + ipAddr.getHostAddress());
//      } catch (UnknownHostException e) {
//         System.out.println("Exception occurred " + e);
//      }
//   }
//}


import java.net.InetAddress; 
import java.net.UnknownHostException; 
import java.util.Scanner; 

public class GetIP { 

    public static void main(String[] args) throws UnknownHostException 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IP Address: ");
        String ip = sc.nextLine();
        InetAddress address = InetAddress.getByName(ip); 
        System.out.println("Hostname of given IP Address: " + address.getHostName()); 
    } 
}


