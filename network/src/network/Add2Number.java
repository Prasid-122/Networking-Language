
package network;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

public class Add2Number {
    public static void main(String[] args) throws MalformedURLException, IOException {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any two number");
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        
        URL url =new URL("http://localhost/serverDemo/add.php?num1"+num1+"&num2="+num2);
        //connection open
        URLConnection conn =url.openConnection();
        //read the data
        InputStream stream = conn.getInputStream();
//        now read the data from stream using InputStreamReader
        InputStreamReader r =new InputStreamReader(stream);

    //loop through each character

int c;
        while ((c=r.read())!=-1) {
            System.out.println((char)c);
            
        }
    }
}
