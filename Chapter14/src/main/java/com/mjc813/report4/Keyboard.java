package com.mjc813.report4;

import java.util.Scanner;

public class Keyboard implements Runnable {
    private String ch1;
    public Keyboard(String ch1) {
        this.ch1 = ch1;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(ch1);
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("종료");
                break;
            }
        }
    }
}