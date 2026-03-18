package com.mjc813.chapter07;

import lombok.*;

@Getter
@Setter

public class Subject {
    public String subName;
    public String professor;

    public Subject(String subname, String professor) {
        this.subName = subname;
        this.professor = professor;
    }
}
