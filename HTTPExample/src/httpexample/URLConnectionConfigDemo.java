/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package httpexample;

import java.io.*;

import java.net.*;
import java.util.*;

/**
 *
 * @author Prasid
 */
public class URLConnectionConfigDemo {

    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("http://www.google.com");

        URLConnection conn = url.openConnection();
        System.out.println(conn.getURL());

        conn.setDoInput(true);
        System.out.println(conn.getDoInput());

        conn.setDoOutput(false);
        System.out.println(conn.getDoOutput());

        conn.setAllowUserInteraction(false);

        conn.setUseCaches(true);
//        
        conn.setUseCaches(false);

//        InputStream stream = conn.getInputStream();
        
//        Date d =new Date();
        System.out.println(new Date());
        conn.setIfModifiedSince(50000);     //jan 1st 1970
        System.out.println(conn.getIfModifiedSince());
        
//        


        conn.setReadTimeout(5000);
    }
}
