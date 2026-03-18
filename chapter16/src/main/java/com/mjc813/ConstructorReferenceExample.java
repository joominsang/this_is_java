package com.mjc813;

public class ConstructorReferenceExample {
    public void ch08() {
        Person5 person5 = new Person5();

        Member m1 = person5.getMember1(Member :: new);
        System.out.println(m1);
        System.out.println();

        Member m2 = person5.getMember2(Member :: new);
        System.out.println(m2);
    }
}
