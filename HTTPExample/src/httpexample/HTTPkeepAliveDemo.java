
package httpexample;

import java.net.MalformedURLException;
import java.net.URL;


public class HTTPkeepAliveDemo {
    
    public static void main(String[] args) throws MalformedURLException {
        
        URL url = new URL("https://asm.edu.np");
        System.setProperty("http.keepAlive", "true");
        System.setProperty("http.mavConnection","30");
        System.setProperty("http.keepAlive.remainingData","true");
    }
    
}
