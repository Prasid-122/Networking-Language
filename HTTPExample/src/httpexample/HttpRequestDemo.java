/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package httpexample;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class HttpRequestDemo {
    public static void main(String[] args) throws MalformedURLException, IOException {
        
        //1 prepare
        URL url = new URL("http://localhost/sreverdemo");
Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your Email");
        String email = sc.nextLine();
        System.out.println("Enter the address");
        String address = sc.nextLine();
        String q = "name="+name+"Email="+email+"address="+address;
        byte[] postDate = q.getBytes(StandardCharsets.UTF_8);
//        2. Establish the connection using HttpURLConnection
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        
//        3. write the byte date using the output.
        OutputStream stream = conn.getOutputStream();
        stream.write(postDate);
//        4.use the Inputstream to get hte responce
        InputStream in_stream = conn.getInputStream();
        InputStreamReader r =new InputStreamReader(in_stream);
        int c;
        while((c=r.read())!=-1){
            System.out.println((char) c);
        }
        
    }
}
