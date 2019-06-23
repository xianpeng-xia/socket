package com.example.tcpSocket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by xianpeng.xia
 * on 2019-06-23 16:31
 */
public class Client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8888);
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.write("username:admin,password:1234");
            printWriter.flush();
            socket.shutdownInput();
            printWriter.close();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
