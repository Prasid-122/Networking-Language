/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package httpexample;

/**
 *
 * @author Prasid
 */
import java.net.URL;

public class TestURLs {

    public static void main(String[] args) {
        try {
            // Create two URLs
            URL url1 = new URL("http://www.facebook.com");
            URL url2 = new URL("http://www.facebook.com/profile");

            // Compare the two URLs and print the result
            if (url1.equals(url2)) {
                System.out.println("The two URLs are the same.");
            } else {
                System.out.println("The two URLs are not the same.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
