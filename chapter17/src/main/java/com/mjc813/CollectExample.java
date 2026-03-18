package com.mjc813;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public void ch18() {
        List<Student5> totalList = new ArrayList<>();
        totalList.add(new Student5("홍길동", "남", 92));
        totalList.add(new Student5("김수영", "여", 87));
        totalList.add(new Student5("감자바", "남", 95));
        totalList.add(new Student5("오해영", "여", 93));

        List<Student5> maleList = totalList.stream()
                .filter(s -> s.getSex().equals("남"))
                .toList();

        maleList.stream()
                .forEach(s -> System.out.println(s.getName()));

        System.out.println();

        Map<String, Integer> map = totalList.stream()
                .collect(
                        Collectors.toMap(
                                s -> s.getName(),
                                s -> s.getScore()
                        )
                );

        System.out.println(map);
    }
}
