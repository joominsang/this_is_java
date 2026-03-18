package com.mjc813;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientExample {
    public void ch03() {
        Socket socket = null;
        try {
            Socket socket = new Socket("172.111.117.164", 50001);

            System.out.println( "[클라이언트] 연결 성공");

            socket.close();
            System.out.println("[클라이언트] 연결 끊음");

            Scanner scanner = new Scanner(System.in);
            String msg = scanner.nextLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write(msg);

        } catch (UnknownHostException e) {
            throw  new RuntimeException(e);
        } catch (IOException e) {

        }
    }
    public static void main(String[] args) {
        ClientExample ex01 = new ClientExample();
        ex01.ch03();
    }
}