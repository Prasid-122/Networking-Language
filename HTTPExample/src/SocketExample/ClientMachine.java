/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocketExample;

//import javax.swing.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;




public class ClientMachine {
    public static void main(String[] args) {
//        JFrame frame = new JFrame();
//        JPanel p = new JPanel();
//        JLabel lbl = new JLabel("client");
//        JTextArea t = new JTextArea(10,30);
//        JTextField mField = new JTextField(20);
//        JButton btn = new JButton("click");
//        GroupLayout layout = new GroupLayout(p);
//        layout.setVerticalGroup(layout.createSequentialGroup().addComponent(lbl).addComponent(t));
//        p.add(mField);
//        p.add(btn);
//        frame.add(p);
//        frame.setSize(500,500);
//        frame.setVisible(true);
        
           final Socket clientSocket;
           final BufferedReader in;
           final PrintWriter out;
           final Scanner sc = new Scanner(System.in);
           try {
            clientSocket = new Socket("localhost",1234);
               System.out.println("Client Started\n");
               out = new PrintWriter(clientSocket.getOutputStream());
               in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
               
               Thread sender = new Thread(new Runnable(){
                @Override
                public void run() {
                    String msg;
                    while(true){
                        msg = sc.nextLine();
                        out.println(msg);
                        out.flush();
                    }
                    }
                   
               });
               sender.start();
               
               
               Thread receiver =new Thread(new Runnable(){
                  
                   @Override
                   public void run(){
                       String msg;
                       try {
                           msg = in.readLine();
                           while (msg!=null) {                               
                               System.out.println("Server: "+msg);
                               msg = in.readLine();
                               
                           }
                           System.out.println("Server out of service");
                           out.close();
                           clientSocket.close();
                       } catch (IOException e) {
                           e.printStackTrace();
                       }
                   }
               });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
