package com.example;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by xianpeng.xia
 * on 2019-06-23 15:59
 */
public class URLTest {

    public static void main(String[] args) {
        try {
            URL imoocUrl = new URL("http://www.imooc.com");
            URL url = new URL(imoocUrl, "/index.html?username=tom#test");
            System.out.println("protocal : " + url.getProtocol());
            System.out.println("host : " + url.getHost());
            //如果未指定端口号，使用默认端口号，此时getPort()返回值是-1
            System.out.println("port : " + url.getPort());
            System.out.println("file path : " + url.getPath());
            System.out.println("file name : " + url.getFile());
            System.out.println("ref path : " + url.getRef());
            System.out.println("query str : " + url.getQuery());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
