/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package httpexample;

/**
 *
 * @author Prasid
 */
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

public class ProxyServerDemo {
	public static void main(String[] args) throws IOException {
		// Set the proxy details
		String proxyHost = "192.168.1.100";
		int proxyPort = 8080;
		
		// Create a proxy object
		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));

		// Create a URL object
		URL url = new URL("http://www.example.com");
		
		// Open a connection using the proxy
		URLConnection conn = url.openConnection(proxy);
		
		// Print the URL connection
		System.out.println("URL Connection: " + conn);
	}
}