package com.mjc813;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public void ch24() {
        List<Member1> list = Arrays.asList(
                new Member1("홍길동", "개발자"),
                new Member1("김나리", "디자이너"),
                new Member1("신용권", "개발자")
        );
        List<Member1> developers = list.stream()
                .filter(m -> m.getJob().equals("개발자"))
                .toList();

        developers
                .stream()
                .forEach(m -> System.out.println(m.getName()));
    }
}
