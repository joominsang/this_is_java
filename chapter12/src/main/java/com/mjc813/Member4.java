package com.mjc813;

import lombok.Data;
import lombok.NonNull;

@Data
public class Member4 {
    private final String id;
    @NonNull private String name;
    private int age;
}
