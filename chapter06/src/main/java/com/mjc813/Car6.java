package com.mjc813;

public class Car6 {
    int speed;
    void run() {
        System.out.println(speed + "으로 달립니다.");
    }
    static void simulate() {
        Car6 myCar = new Car6();
        myCar.speed = 200;
        myCar.run();
    }
}
