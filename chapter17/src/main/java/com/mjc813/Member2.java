package com.mjc813;

public class Member2 {
    private String name;
    private String job;

    public Member2(String name, String job) {
        this.name = name;
        this.job = job;
    }
    public String getName() {
        return name;
    }
    public String getJob() {
        return job;
    }

        @Override
                public String toString() {
            return "{name:" + name + ", job:" + job + "}";
    }
}
