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
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws IOException {
        Socket sc = new Socket("localhost",3333);
         PrintWriter p= new PrintWriter(sc.getOutputStream(),true);
      
         Scanner s = new Scanner(System.in);
         System.out.println("Enter some message");
         int num = s.nextInt();
         p.print(num);
         BufferedReader r =new BufferedReader(new InputStreamReader(sc.getInputStream()));
         System.out.println(r.read());
         p.flush();
         sc.close();
         
//         r.write(s.nextLine());
//         r.flush();
    }
   
}
