package network;

import java.io.*;
import java.net.*;
import java.util.*;

public class ServerCommunicationDemoTHroughGET {

    public static void main(String[] args) throws MalformedURLException, IOException  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter the Email");
        String email = sc.nextLine();

        URL url = new URL("https://localhost/severdemo/fullname" + name + "&email" + email);
        URLConnection conn = url.openConnection();
        InputStream stream = conn.getInputStream();
        InputStreamReader r = new InputStreamReader(stream);
        
  int c;
        while ((c= r.read())!= -1){
            System.out.println((char) c);
        }
        
    }
}
