package com.mjc813;

import java.util.Arrays;
import java.util.List;

public class Example {
    public void ch22() {
        List<String> list = Arrays.asList(
                "This is a Java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );
        list.stream()
                .filter(n -> n.contains("Java"))
                .forEach(n -> System.out.println(n));
    }
}
