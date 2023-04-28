/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocketExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Prasid
 */
public class ClientSide {
    static BufferedReader bufferedReader = null;
    static String line;
    public static void main(String[] args) throws IOException {
        Socket sc = new Socket("localhost", 5555);
        bufferedReader = new BufferedReader(new InputStreamReader(sc.getInputStream()));
        while ((line=bufferedReader.readLine())!=null) {
            System.out.println(line);
        }
            bufferedReader.close();
            sc.close();
            
        
    }
}
