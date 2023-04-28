/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package httpexample;

import java.io.UnsupportedEncodingException;
import java.net.*;

/**
 *
 * @author Prasid
 */
public class UrlEncodeDecode {
    public static void main(String[] args) {
        String url = "https://www.google.com";
        String encodedUrl = encodeURL(url);
        System.out.println("Encoded URL: "+ encodedUrl);
        String decodedUrl = decodeURL(encodedUrl);
        System.out.println("Decoded URL: "+ decodedUrl);
    }
    public static String encodeURL(String url) {
        try {
            String encodedUrl = URLEncoder.encode(url, "UTF-8");
            return encodedUrl;
        } catch (UnsupportedEncodingException e) {
            return "Error: " + e.getMessage();
        }
    }
    public static String decodeURL(String url) {
        try {
            String decodedUrl = URLDecoder.decode(url, "UTF-8");
            return decodedUrl;
        } catch (UnsupportedEncodingException e) {
            return "Error: " + e.getMessage();
        }
    }
}