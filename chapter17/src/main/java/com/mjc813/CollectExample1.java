package com.mjc813;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample1 {
    public void ch19() {
        List<Student5> totalList = new ArrayList<>();
        totalList.add(new Student5("홍길동", "남", 92));
        totalList.add(new Student5("김수영", "여", 87));
        totalList.add(new Student5("감자바", "남", 95));
        totalList.add(new Student5("오해영", "여", 93));

        Map<String, List<Student5>> map = totalList.stream()
                .collect(
                        Collectors.groupingBy(s -> s.getSex())
                );

        List<Student5> maleList  = map.get("남");
        maleList.stream().forEach(s -> System.out.println(s.getName()));
        System.out.println();

        List<Student5> femaleList = map.get("여");
        femaleList.stream().forEach( s-> System.out.println(s.getName()));
    }
}
