package com.mjc813;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public void ch07() {
        List<String> list = new ArrayList<>();
        list.add("홍길동"); list.add("신용권");
        list.add("감자마"); list.add("신용권"); list.add("신민철");

        list.stream()
                .distinct()
                .forEach(n -> System.out.println(n));
        System.out.println();

        list.stream()
                .filter(n -> n.startsWith("신"))
                .forEach(n -> System.out.println(n));
        System.out.println();

        list.stream()
                .distinct()
                .filter(n -> n.startsWith("신"))
                .forEach(n -> System.out.println(n));
    }
}
