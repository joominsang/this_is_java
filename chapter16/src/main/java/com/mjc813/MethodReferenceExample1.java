package com.mjc813;

public class MethodReferenceExample1 {
    public void ch07() {
        Person4 person4 = new Person4();
        person4.ordering(String :: compareToIgnoreCase);
    }
}
