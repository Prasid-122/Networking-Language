/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package httpexample;

/**
 *
 * @author Prasid
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class RetrieveRawHTML {

	public static void main(String[] args) throws IOException {
		// The URL of the page whose HTML we want to retrieve
		String address = "https://www.example.com/";

		// Create a URL object
		URL url = new URL(address);

		// Read all the text returned by the server
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

		String line;
		StringBuilder rawHTML = new StringBuilder();
		while ((line = in.readLine()) != null) {
			rawHTML.append(line);
			rawHTML.append("\n");
		}
		in.close();

		// Print the raw HTML
		System.out.println(rawHTML.toString());
	}

}