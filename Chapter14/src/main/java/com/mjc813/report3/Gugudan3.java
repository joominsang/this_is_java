package com.mjc813.report3;

public class Gugudan3 extends Thread {
    @Override
    public void run() {
        for(int i = 7; i<= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i*j);
                try {
                    Thread.sleep(50);
                } catch (Exception e) {
                }
            }
        }
    }
    public void threadStart() {

        Thread thread = new Thread();
        for(int i = 4; i <=6 ; i++) {
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
        Gugudan3 g3 = new Gugudan3();
        g3.start();
        threadStart();
        for(int i = 2; i <=3 ; i++) {
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
