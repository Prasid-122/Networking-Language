/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package httpexample;

/**
 *
 * @author Prasid
 */
public class UriSplit {
    public static void main(String[] args) {
        String uriString = "http://www.example.com:80/path/to/myfile.html?key1=value1&key2=value2#Fragment";

        // Split the URI string at the delimiter '://'
        String[] uriParts = uriString.split("://");

        // Get the protocol part
        String protocol = uriParts[0];
        System.out.println("Protocol: " + protocol);

        // Get the rest of the URI string
        String remainingUri = uriParts[1];

        // Split the remaining string at the ':' delimiter
        String[] remainingParts = remainingUri.split(":");

        // Get the host part
        String host = remainingParts[0];
        System.out.println("Host: " + host);

        // Get the port part
        String port = remainingParts[1].split("/")[0];
        System.out.println("Port: " + port);

        // Get the path part
        String path = remainingUri.split("\\?")[0];
        System.out.println("Path: " + path);

        // Get the query part
        String query = remainingUri.split("#")[0].split("\\?")[1];
        System.out.println("Query: " + query);

        // Get the fragment part
        String fragment = remainingUri.split("#")[1];
        System.out.println("Fragment: " + fragment);
    }
}
