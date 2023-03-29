/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network;

/**
 *
 * @author Prasid
 */
import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {
    public static void main(String[] args) {
        try {
            URL url1 = new URL("http://www.fb.com");
            URL url2 = new URL("http://www.facebook.com");
            if (url1.equals(url2)) {
                System.out.println("URLs are same.");
            } else {
                System.out.println("URLs are different.");
            }
        } catch (MalformedURLException e) {
           
        }
    }
}