///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package SocketExample;
//
////import static SocketExample.ClientSideJFrame.btn;
////import static SocketExample.ClientSideJFrame.lbl;
////import static SocketExample.ClientSideJFrame.txtArea;
////import static SocketExample.ClientSideJFrame.txtField;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.Scanner;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//
//public class ServerSideJframe {
//     static JLabel lbl;
//    static JTextArea txtArea;
//    static JTextField txtField;
//    static JButton btn;
//     public static void main(String[] args) {
//         JFrame frame = new JFrame();
//        lbl=  new JLabel("Server");
//        txtArea = new JTextArea(20,40);
//        txtField  = new JTextField(20);
//        btn = new JButton("send");
//        txtArea.disable();
//        JPanel panel = new JPanel();
//        panel.add(lbl);
//        panel.add(txtArea);
//        panel.add(txtField);
//        panel.add(btn);
//        frame.add(panel);
//        frame.setVisible(true);
//        frame.setSize(500, 500);
//         final ServerSocket serverSocket;
//        final Socket clienSocket;
//        final BufferedReader in;
//        final PrintWriter out;
//        final Scanner sc = new Scanner(System.in);
//
//        try {
//                serverSocket = new ServerSocket(1234);
//                clienSocket = serverSocket.accept();
//                System.out.println("Server Startede\n");
//                out = new PrintWriter(clienSocket.getOutputStream());
//                in = new BufferedReader(new InputStreamReader(clienSocket.getInputStream()));
//                btn.addActionListener(new ActionListener() {
//                String msg ;
//                @Override
//                public void actionPerformed(ActionEvent e){
//                    msg = txtField.getText();
//                    txtArea.setText(txtArea.getText()+"\nMe:"+msg);
//                    txtField.setText("");
//                    out.println(msg);
//                    out.flush();
//                    
//                }
//                }
//                        );
////                Thread sender = new Thread(new Runnable()
////                {
////                   String msg;
////                   @Override
////                   public void run(){
////                       while(true){
////                           msg =sc.nextLine();
////                           out.println(msg);
////                           out.flush();
////                           
////                       }
////                   }
////                });
////                sender.start();
//
//
//                
//                Thread receive = new Thread(new Runnable()
//                {
//                        String msg;
//                        @Override
//                        public void run(){
//                            try {
//                                msg= in.readLine();
//                                while (msg!=null) {
//                                  txtArea.setText(txtArea.getText()+"\nServer"+msg);
//                                    msg= in.readLine();
//                                                                       
//                                }
//                                System.out.println("server out of service");
//                                out.close();
//                                clientSocket.close();
//                            } catch (Exception e) {
//                                e.printStackTrace();
//                            }
//                        }
//                });
//                receive.start();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//        
//    
//serverside
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocketExample;
//import static SocketDemo.ClientSideJFrame.textArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Shalon
 */
public class ServerSideJframe {
    static JLabel lbl;
    static JTextArea textArea;
    static JTextField textField;
    static JButton btn;
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        lbl = new JLabel("Server");
        textArea = new JTextArea(20,40);
        textField = new JTextField(20);
        textArea.disable();
        btn = new JButton("Send");
        JPanel panel =  new JPanel();
        panel.add(lbl);
        panel.add(textArea);
        panel.add(textField);
        panel.add(btn);
        frame.add(panel);
        frame.setSize(500,500);
        frame.setVisible(true);
        
        final ServerSocket  serverSocket;
          final Socket clientSocket;
          final BufferedReader in;
          final PrintWriter out;
          
          try{
              serverSocket = new ServerSocket(1234);
              clientSocket = serverSocket.accept();
              System.out.println("server started\n");
              out = new PrintWriter(clientSocket.getOutputStream());
              in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
              btn.addActionListener(new ActionListener() {
                  String msg;
                  @Override
                  public void actionPerformed(ActionEvent e) {
                      msg = textField.getText();
                   textArea.setText(textArea.getText()+"\nMe:"+msg);
                   textField.setText("");
                   out.println(msg);
                   out.flush();
                  }
              });
              
              Thread receive = new Thread(new Runnable(){
                  String msg;

                  @Override
                  public void run() {
                      try{
                          msg=in.readLine();
                          while(msg!=null){
                             textArea.setText(textArea.getText()+"\nClient:"+msg);;
                              msg = in.readLine();
                              
                          }
                          System.out.println("Client Disconnected");
                          out.close();
                          serverSocket.close();
                          
                      }catch(IOException e){
                          e.printStackTrace();
                      }
                  }
                  
              });
              receive.start();
          }catch(IOException e){
              e.printStackTrace();
          }
          
          
    }
}