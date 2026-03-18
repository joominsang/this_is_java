package com.mjc813.chapter08;

public class Chapter08 {
    public static void main(String[] args) {
        Remocon r = new TV();
        r.powerOn();

        SoundableExample.printSound(new Dog());
        SoundableExample.printSound(new Cat());

        Example.action(new B());
        Example.action(new C());

        DaoExample.dbWork(new OracleDao());
        DaoExample.dbWork(new MySqlDao());
    }
}
