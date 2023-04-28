/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocketExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket sc = new ServerSocket(3333);
        
        System.out.println("Server is started");
        sc.setSoTimeout(400000);
        Socket socket = sc.accept();
        
        BufferedReader r = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter stream = new PrintWriter(socket.getOutputStream(),true);
//        int n1 =Integer.parseInt(r.readLine());
//        int n2 = Integer.parseInt(r.readLine());
//        stream.println("Factorial = " +(n1*n2));
        stream.flush();
        socket.close();
        sc.close();
        
        
    }
    
}
