package com.mjc813;

public class LambdaExample2 {
    public void ch04() {
        Person1 person1 = new Person1();

        person1.action1((name, job) -> {
            System.out.println(name + "이");
            System.out.println(job + "을 합니다.");
        });
        person1.action2((word) -> {
            System.out.println("\"" + word + "\"");
            System.out.println("라고 말합니다.");
        });
        person1.action2(word -> System.out.println("\"" + word + "\"" + word + "\"라고 외칩니다."));
    }
}
