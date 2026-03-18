package com.mjc813;

public class MethodReferenceExample {
    public void ch06() {
        Person3 person3 = new Person3();

        person3.action(Computer :: staticMethod);

        Computer com = new Computer();

        person3.action(com :: instanceMethod);
    }
}
