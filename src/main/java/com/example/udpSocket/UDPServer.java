package com.example.udpSocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by xianpeng.xia
 * on 2019-06-23 17:43
 */
public class UDPServer {

    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(8800);
        byte[] data = new byte[1024];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        System.out.println("******服务器已经启动，等待客户端连接******");
        //此方法在接收到数据报之前会一直阻塞
        datagramSocket.receive(packet);
        String info = new String(data, 0, packet.getLength());
        System.out.println("我是服务器，客户端说：" + info);
    }
}
