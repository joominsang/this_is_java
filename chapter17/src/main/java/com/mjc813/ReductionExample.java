package com.mjc813;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
    public void ch17() {
        List<Student4> studentList4 = Arrays.asList(
                new Student4("홍길동", 92),
                new Student4("신용권", 95),
                new Student4("감자바", 88)
        );

        int sum1 = studentList4.stream()
                .mapToInt(Student4 :: getScore)
                .sum();

        int sum2 = studentList4.stream()
                .map(Student4 :: getScore)
                .reduce(0, (a, b) -> a + b);

        System.out.println("sum1: " + sum1);
        System.out.println("sum2: " + sum2);
    }
}
