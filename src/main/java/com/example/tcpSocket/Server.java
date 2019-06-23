package com.example.tcpSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
            BufferedReader br = new BufferedReader(inputStreamReader);
            String info = null;
            while ((info = br.readLine()) != null) {
                System.out.println("我是服务器，客户端说：" + info);
            }
            socket.shutdownInput();
            br.close();
            inputStreamReader.close();
            inputStream.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
