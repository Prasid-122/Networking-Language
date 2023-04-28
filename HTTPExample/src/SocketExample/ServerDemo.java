/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocketExample;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author Marshall
 */
public class ServerDemo {
    public static void main(String[] args) {
        ServerSocket sc;
        try {
            sc=new ServerSocket(3333);
            sc.setReuseAddress(true);
            System.out.println("Server is waiting");
            
            while (true) {     
                Socket client= sc.accept();
                System.out.println("New client is requested"+client.getInetAddress().getHostAddress());
                ClientHandler clientsock=new ClientHandler(client);
                new Thread(clientsock).start();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static class ClientHandler implements Runnable{
        private static Socket clientSocket;
        
        public ClientHandler(Socket sc){
            this.clientSocket=sc;
        }

      
        @Override
        public void run() {
             PrintWriter printWriter=null;
            try {
                printWriter=new PrintWriter(clientSocket.getOutputStream(),true);
                Date date=new Date();
                System.out.println(date.toString());
                printWriter.println(date.toString());
                printWriter.flush();
            } catch (IOException e) {
            }
        }
        }
}