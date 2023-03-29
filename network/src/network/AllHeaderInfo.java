package network;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public class AllHeaderInfo {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url =new URL("http://www.google.com");
        URLConnection conn =url.openConnection();
        InputStream stream = conn.getInputStream();
        
        for(int i = 0;; i++){
            String header =conn.getHeaderField(i);
            if(header==null){
                break;
                
            }
            System.out.println(conn.getHeaderFieldKey(1)+"="+header);
            
        }
        
    }
    
}
