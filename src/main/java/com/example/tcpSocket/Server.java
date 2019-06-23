package com.example.tcpSocket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by xianpeng.xia
 * on 2019-06-23 16:31
 */
public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("******服务器即将启动，等待客户端连接******");
            int count = 0;
            Socket socket = null;
            while (true) {
                socket = serverSocket.accept();
                ServerThread serverThread = new ServerThread(socket);
                serverThread.start();
                count++;
                System.out.println("clint count : " + count);
                InetAddress address = socket.getInetAddress();
                System.out.println("client ip: " + address.getHostAddress());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
