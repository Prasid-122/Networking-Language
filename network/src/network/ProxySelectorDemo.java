package network;

import java.io.IOException;
import java.net.*;
import java.util.*;

public class ProxySelectorDemo extends ProxySelector {

    public List<Proxy> select(URI uri) {
        SocketAddress a = new InetSocketAddress("192.168.10.1", 80);

        Proxy p1 = new Proxy(Proxy.Type.HTTP, a);
        SocketAddress b = new InetSocketAddress("192.168.10.2", 80);
        Proxy p2 = new Proxy(Proxy.Type.HTTP, b);
        SocketAddress c = new InetSocketAddress("192.168.10.3", 80);
        Proxy p3 = new Proxy(Proxy.Type.HTTP, c);

        List<Proxy> list = new ArrayList();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        return null;
    }

    @Override
    public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void main(String[] args) {
        new ProxySelectorDemo();
    }
}
