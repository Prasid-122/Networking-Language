/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package httpexample;

/**
 *
 * @author Prasid
 */
import java.net.URI;
import java.net.URISyntaxException;

public class RelativeUriToAbsoluteUri {

    public static void main(String[] args) {
        String relativeUri = "/hello/world";
        String baseUri = "http://www.example.com";
        URI absoluteUri;

        try {
            absoluteUri = new URI(baseUri).resolve(relativeUri);
            System.out.println("Absolute URI: " + absoluteUri);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
