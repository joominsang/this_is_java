package com.mjc813.report1;

public class Gugudan {
    public void main(String[] args) {
        for(int i = 2; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i*j);
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
            }
        }
    }
}
