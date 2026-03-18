package com.mjc813.chapter08;

public class TV implements Remocon{
    @Override
    public void powerOn() {
        System.out.println("TV를 켰습니다");
    }
    public void main(String[] args) {
        Remocon r = new TV();
        r.powerOn();
    }
}
