/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocketExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;
//import java.util.Scanner;

/**
 *
 * @author Prasid
 */
public class ClientSideData {
    
    public static void main(String[] args) throws IOException {
        Socket sc = new Socket("localhost",3452);
         PrintWriter p= new PrintWriter(sc.getOutputStream(),true);
        Date date = new Date();
         System.out.println("Date "+date);
       
         BufferedReader r =new BufferedReader(new InputStreamReader(sc.getInputStream()));
         System.out.println(r.read());
         p.flush();
         sc.close();
    }
}
