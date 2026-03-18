package com.mjc813;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example3 {
    public void ch25() {
        List<Member2> list = Arrays.asList(
                new Member2("홍길동", "개발자"),
                new Member2("김나리", "디자이너"),
                new Member2("신용권", "개발자")
        );
        Map<String, List<Member2>> groupingMap = list.stream()
                .collect(
                        Collectors.groupingBy(s -> s.getJob())
                );
        System.out.println("개발자");
    }
}
