///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package SocketExample;
//
//import java.awt.Frame;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.net.Socket;
//import javax.swing.*;
//
//
//public class ClientSideJFrame {
//    static JLabel lbl;
//    static JTextArea txtArea;
//    static JTextField txtField;
//    static JButton btn;
//    public static void main(String[] args) {
//        JFrame frame= new JFrame();
//        lbl=  new JLabel("client");
//        txtArea = new JTextArea(20,40);
//        txtField  = new JTextField(20);
//        btn = new JButton("send");
//        
//        JPanel panel = new JPanel();
//        panel.add(lbl);
//        panel.add(txtArea);
//        panel.add(txtField);
//        panel.add(btn);
//        frame.add(panel);
//        frame.setVisible(true);
//        frame.setSize(500, 500);
//        
//        
//         final Socket clientSocket;
//           final BufferedReader in;
//           final PrintWriter out;
//           try {
//            clientSocket = new Socket("localhost",1234);
//               System.out.println("Client Started\n");
//               out = new PrintWriter(clientSocket.getOutputStream());
//               in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//                btn.addActionListener(new ActionListener() {
//                String msg ;
//                @Override
//                public void actionPerformed(ActionEvent e){
//                    msg = txtField.getText();
//                    txtArea.setText(txtArea.getText()+"\\nMe"+msg);
//                    txtField.setText("");
//                    out.println(msg);
//                    out.flush();
//                    
//                }
//                }
//                        );
////               Thread sender = new Thread(new Runnable(){
////                @Override
////                public void run() {
////                    String msg;
////                    while(true){
////                        msg =txtField.getText();
////                        txtArea.setText(txtArea.getText() + "\n server :"+ msg);
////                        out.println(msg);
////                        out.flush();
////                    }
////                    }
////                   
////               });
////               sender.start();
//               
//               
//               Thread receiver =new Thread(new Runnable(){
//                  
//                   @Override
//                   public void run(){
//                       String msg;
//                       try {
//                           msg = in.readLine();
//                           while (msg!=null) {                               
//                               txtArea.setText(txtArea.getText()+"\n server:"+msg);
//                               msg = in.readLine();
//                               
//                           }
//                           System.out.println("Server out of service");
//                           out.close();
//                           clientSocket.close();
//                       } catch (IOException e) {
//                           e.printStackTrace();
//                       }
//                   }
//               });
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//    
//    
//
package SocketExample;

import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.*;

/**
 *
 * @author Shalon
 */
public class ClientSideJFrame {
    
    static JLabel lbl;
    static JTextArea textArea;
    static JTextField textfield;
    static JButton btn;
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        lbl = new JLabel("Client");
        textArea = new JTextArea(20,40);
        textfield = new JTextField(20);
        textArea.disable();
        btn = new JButton("Send");
        JPanel panel =  new JPanel();
        panel.add(lbl);
        panel.add(textArea);
        panel.add(textfield);
        panel.add(btn);
        frame.add(panel);
        frame.setSize(500,500);
        frame.setVisible(true);
        
        final Socket clientSocket;
        final BufferedReader in;
        final PrintWriter out;
        
        try{
            clientSocket = new Socket("127.0.0.1",1234);
              System.out.println("Client Started\n");
              out = new PrintWriter(clientSocket.getOutputStream());
              in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
              
              //action listener
              btn.addActionListener(new ActionListener() {
                  String msg;
                @Override
                public void actionPerformed(ActionEvent e) {
                   msg = textfield.getText();
                   textArea.setText(textArea.getText()+"\nMe:"+msg);
                   textfield.setText("");
                   out.println(msg);
                   out.flush();
                   
                }
              });
              
              Thread receiver = new Thread(new Runnable(){
              String msg;
              @Override
              public void run() {
                 try{
                     msg= in.readLine();
                     while(msg!=null){
                         textArea.setText(textArea.getText()+"\nServer:"+msg);
                         msg= in.readLine();
                     }
                     System.out.println("Server out of service");
                     out.close();
                     clientSocket.close();
                 }catch(IOException e){
                     e.printStackTrace();
                 }
              }
              
          });
          receiver.start();
          
        
    }catch(IOException e){
    e.printStackTrace();
}
}
}