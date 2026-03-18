package com.mjc813;

import java.util.Date;

public class Character {
    String name;
    String job;
    String gender;
    String birthday;
    int str;
    int intt;
    int dex;
    int lux;

    Character(String name, String job, String gender, String birthday, int str, int intt, int dex, int lux) {
        this.name = name;
        this.job = job;
        this.gender = gender;
        this.birthday = birthday;
        this.str = str;
        this.intt = intt;
        this.dex = dex;
        this.lux = lux;
    }
}
