package network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TestIPv4orIPv6 {

    public static void main(String[] args) throws UnknownHostException, IOException {

        // TESTING IPV4 OR IPV6
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ip address");
        String i = sc.nextLine();
        InetAddress ip = InetAddress.getByName(i);

        if (ip.getAddress().length == 4) {
            System.out.println("IPv4");

        } else if (ip.getAddress().length == 16) {
            System.out.println("IPV6");

        } else {
            System.out.println("Wrong Ip Address");
        }
    }
}