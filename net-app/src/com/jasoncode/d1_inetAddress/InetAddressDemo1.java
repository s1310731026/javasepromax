package com.jasoncode.d1_inetAddress;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo1 {
    public static void main(String[] args) {
        try {
            //1. 獲取本機地址對象

            InetAddress ip1 = InetAddress.getLocalHost();
            System.out.println(ip1.getHostName());
            System.out.println(ip1.getHostAddress());

            //2. 獲取域名ip對象
            InetAddress ip2 = InetAddress.getByName("www.google.com");
            System.out.println(ip2.getHostName());
            System.out.println(ip2.getHostAddress());

            //3.獲取公網IP對象
            InetAddress ip3 = InetAddress.getByName("142.251.42.228");
            System.out.println(ip3.getHostName());
            System.out.println(ip3.getHostAddress());

            //4.判斷是否能通: ping 5s之前測試是否可通
            System.out.println(ip3.isReachable(5000));

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
