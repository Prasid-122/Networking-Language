package SocketExample;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class HttpServerdemo {
    public static void main(String[] args) throws IOException {
        int port = 5555;

        // Create a new HTTP server
        HttpServer server;
        server = HttpServer.create(new InetSocketAddress(port), 0);

        // Create a new handler for the root path
        server.createContext("/", new HttpHandler() {
            public void handle(HttpExchange exchange) throws IOException {
                String response = "<h1>Hello<h1/>";
                exchange.sendResponseHeaders(200, response.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        });
        
         // Create a new handler for the contact path
        server.createContext("/contact", new HttpHandler() {
            public void handle(HttpExchange exchange) throws IOException {
                String response = "This is the contact page";
                exchange.sendResponseHeaders(200, response.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        });
        
                // Create a new handler for the about path
        server.createContext("/about", new HttpHandler() {
            public void handle(HttpExchange exchange) throws IOException {
                String response = "This is the about page";
                exchange.sendResponseHeaders(200, response.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        });

        // Start the server
        server.start();

        System.out.println("Server started on port " + port);
    }
}
