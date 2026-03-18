package com.mjc813;

public class RecordExample {
    public void ch04() {
        Member1 m = new Member1("winter", "눈송이", 25);
        System.out.println(m.id());
        System.out.println(m.name());
        System.out.println(m.age());
        System.out.println(m.toString());
        System.out.println();

        Member1 m1 = new Member1("winter", "눈송이", 25);
        Member1 m2 = new Member1("winter", "눈송이", 25);
        System.out.println("m1.hashCode(): " + m1.hashCode());
        System.out.println("m2.hashCode(): " + m2.hashCode());
        System.out.println("m1.equals(m2): " + m1.equals(m2));
    }
}