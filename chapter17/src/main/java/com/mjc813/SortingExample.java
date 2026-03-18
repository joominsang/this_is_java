package com.mjc813;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
    public void ch11() {
        List<Student2> studentList = new ArrayList<>();
        studentList.add(new Student2("홍길동", 30));
        studentList.add(new Student2("신용권", 10));
        studentList.add(new Student2("유미선", 20));

        studentList.stream()
                .sorted( )
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
        System.out.println();

        studentList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
    }
}
