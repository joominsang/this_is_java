package com.mjc813.chapter07;

import lombok.*;

@Getter
@Setter

public class Student {
    public String name;
    public String hakbun;
    int age;

    public Student(String name, String hakbun, int age) {
        this.name = name;
        this.hakbun = hakbun;
        this.age = age;
    }
}
