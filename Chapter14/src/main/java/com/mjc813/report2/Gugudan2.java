package com.mjc813.report2;

public class Gugudan2 extends Thread {
    @Override
    public void run() {
        for(int i = 5; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i*j);
                try {
                    Thread.sleep(50);
                } catch (Exception e) {
                }
            }
        }
    }
    public void main(String[] args) {
        Gugudan2 g2 = new Gugudan2();
        g2.start();
        for(int i = 2; i <= 4; i++) {
            for(int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i*j);
                try {
                    Thread.sleep(50);
                } catch (Exception e) {
                }
            }
        }
    }
}