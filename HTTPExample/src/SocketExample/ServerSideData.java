/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocketExample;

import java.io.*;
import java.net.*;
import java.util.Date;


/**
 *
 * @author Prasid
 */
public class ServerSideData {

    public static void main(String[] args) throws IOException{
      
        
ServerSocket sc = new ServerSocket(3452);
        
        System.out.println("Server is started");
        sc.setSoTimeout(400000);
        Socket socket = sc.accept();
        
        BufferedReader r = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter stream = new PrintWriter(socket.getOutputStream(),true);
        Date date = new Date();
        System.out.println(date);
        stream.flush();
        socket.close();
        sc.close();
    }
}
