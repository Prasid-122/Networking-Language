/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocketExample;

import java.io.*;
import java.net.*;
import java.util.*;
//import javax.swing.*;

public class servermachine {

    public static void main(String[] args) {
//        JFrame frame = new JFrame();
//        JPanel p = new JPanel();
//        JLabel lbl = new JLabel("server");
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

        final ServerSocket serverSocket;
        final Socket clienSocket;
        final BufferedReader in;
        final PrintWriter out;
        final Scanner sc = new Scanner(System.in);

        try {
                serverSocket = new ServerSocket(1234);
                clienSocket = serverSocket.accept();
                System.out.println("Server Startede\n");
                out = new PrintWriter(clienSocket.getOutputStream());
                in = new BufferedReader(new InputStreamReader(clienSocket.getInputStream()));
                Thread sender = new Thread(new Runnable()
                {
                   String msg;
                   @Override
                   public void run(){
                       while(true){
                           msg =sc.nextLine();
                           out.println(msg);
                           out.flush();
                           
                       }
                   }
                });
                sender.start();
                
                Thread receive = new Thread(new Runnable()
                {
                        String msg;
                        @Override
                        public void run(){
                            try {
                                msg= in.readLine();
                                while (msg!=null) {
                                    System.out.println("client = "+msg);
                                    msg= in.readLine();
                                                                       
                                }
                                System.out.println("Client DIsconnected");
                                out.close();
                                serverSocket.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                });
                receive.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
