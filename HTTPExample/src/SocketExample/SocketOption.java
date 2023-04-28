import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;

public class SocketOption {
    public static void main(String[] args) {
        Socket socket = new Socket();
        try {
            // Set the TCP_NODELAY option
            socket.setTcpNoDelay(true);
            System.out.println("TCP_NODELAY: " + socket.getTcpNoDelay());

            // Set the SO_LINGER option
            socket.setSoLinger(true, 10);
            System.out.println("SO_LINGER: " + socket.getSoLinger());

            // Set the SO_TIMEOUT option
            socket.setSoTimeout(5000);
            System.out.println("SO_TIMEOUT: " + socket.getSoTimeout());

            // Set the SO_RCVBUF and SO_SNDBUF options
            socket.setReceiveBufferSize(8192);
            socket.setSendBufferSize(8192);
            System.out.println("SO_RCVBUF: " + socket.getReceiveBufferSize());
            System.out.println("SO_SNDBUF: " + socket.getSendBufferSize());

            // Set the SO_KEEPALIVE option
            socket.setKeepAlive(true);
            System.out.println("SO_KEEPALIVE: " + socket.getKeepAlive());

            // Set the OOBINLINE option
            socket.setOOBInline(true);
            System.out.println("OOBINLINE: " + socket.getOOBInline());

            // Set the SO_REUSEADDR option
            socket.setReuseAddress(true);
            System.out.println("SO_REUSEADDR: " + socket.getReuseAddress());

            // Set the IP_TOS option
            socket.setTrafficClass(0x10);
            System.out.println("IP_TOS: " + socket.getTrafficClass());

            // Connect the socket to a remote host
            socket.connect(new InetSocketAddress("www.google.com", 80));
            System.out.println("Connected to " + socket.getRemoteSocketAddress());
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the socket when done
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}