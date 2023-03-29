/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 *
 * @author Prasid
 */
public class HeaderInfo {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url =new URL("http://www.google.com");
        URLConnection conn =url.openConnection();
        InputStream stream = conn.getInputStream();
        
        //method 1
        System.out.println(conn.getContentType());
        System.out.println(new Date(conn.getDate()));
        System.out.println(conn.getContentLength());
        System.out.println(conn.getExpiration());
        System.out.println(conn.getLastModified());
        
        
        //method 2
        System.out.println("**********Method 2****************");
        System.out.println(conn.getHeaderField("content-type"));
        System.out.println(conn.getHeaderField("Content-length"));
        System.out.println(conn.getHeaderField("date"));
        System.out.println(conn.getHeaderField("Last-Modified"));
    }
    
}
