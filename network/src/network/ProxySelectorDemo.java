/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network;

import java.awt.List;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.util.ArrayList;

/**
 *
 * @author Prasid
 */
public class ProxySelectorDemo extends ProxySelector{
    @Override
    public List<Proxy>select(URI uri) {
        
        SocketAddress a =new InetSocketAddress("192.168.10.1","80");
        Proxy p1 = new Proxy(Proxy.Type.HTTP, a1);
        
        SocketAddress a2 =new InetSocketAddress("192.168.10.1","80");
        Proxy p2 = new Proxy(Proxy.Type.HTTP, a2);
        
        SocketAddress a3 =new InetSocketAddress("192.168.10.1","80");
        Proxy p3 = new Proxy(Proxy.Type.HTTP, a3);
        
        List<Proxy>list= new ArrayList();
        
        list.add(p1);
        list.add(p2);
        list.add(p3);
        return list;
        
        
        
        
        
    }
    
    @Override
    public void connectFalied(URI uri,SocketAddress sa, IOException)
    {
        throw new UnsupportedOperationException("Cannot connected with proxy server");///generated form 
    }
}
