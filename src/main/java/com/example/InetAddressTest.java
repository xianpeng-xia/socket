package com.example;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * Created by xianpeng.xia
 * on 2019-06-23 15:39
 */
public class InetAddressTest {

    public static void main(String[] args) throws UnknownHostException {
        //本机
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("computer name : " + address.getHostName());
        System.out.println("ip : " + address.getHostAddress());
        //字节形式ip
        byte[] bytes = address.getAddress();
        System.out.println("byte type ip : " + Arrays.toString(bytes));
        System.out.println(address);

        //根据机器名获取InetAddress实例
        InetAddress address2 = InetAddress.getByName("localhost");
        //InetAddress address2 = InetAddress.getByName("127.0.0.1");
        System.out.println("computer name : " + address2.getHostName());
        System.out.println("ip : " + address2.getHostAddress());

    }
}
