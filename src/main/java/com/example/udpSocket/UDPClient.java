package com.example.udpSocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by xianpeng.xia
 * on 2019-06-23 17:43
 */
public class UDPClient {

    public static void main(String[] args) throws IOException {
        InetAddress serverAddress = InetAddress.getByName("localhost");
        int port = 8800;
        byte[] data = "username :admin,password:p111".getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, serverAddress, port);
        DatagramSocket socket = new DatagramSocket();
        socket.send(packet);
    }
}
