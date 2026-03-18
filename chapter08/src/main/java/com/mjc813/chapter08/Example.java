package com.mjc813.chapter08;

public class Example {
    public static void action(A a) {
        a.method1();
        if(a instanceof C) {
            C c = (C) a;
            c.method2();
        }
    }
}
