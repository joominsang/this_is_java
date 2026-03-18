package com.mjc813;

import java.util.ArrayList;
import java.util.List;

public class SortingExample1 {
    public void ch12() {
        List<Student3> student3List = new ArrayList<>();
        student3List.add(new Student3("홍길동", 30));
        student3List.add(new Student3("신용권", 10));
        student3List.add(new Student3("유미선", 20));

        student3List.stream()
                .sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
        System.out.println();

        student3List.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
    }
}
