package com.mjc813.chapter081;

import lombok.*;

@Getter
@Setter

public class Doctor {
    private String name;

        public Doctor(String name) {
            this.name = name;
        }
}
