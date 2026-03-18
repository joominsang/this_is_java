package com.mjc813;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public void ch04() {
        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java");
        set.add("Spring");

        int size = set.size();
        System.out.println("총 객체 수: " + size);
    }
}
