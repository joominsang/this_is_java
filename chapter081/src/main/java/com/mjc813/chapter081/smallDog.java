package com.mjc813.chapter081;

import java.time.LocalDate;

public class smallDog {
    private String name;
    private String id;
    private LocalDate inhospital;
    private Doctor doctor;
    private LocalDate outhospital;
    private Master master;
    private int visit;

    public smallDog(String name, String id, LocalDate inhospital, Doctor doctor, Master master) {
        this.name = name;
        this.id = id;
        this.inhospital = inhospital;
        this.doctor = doctor;
        this.outhospital = outhospital;
        this.master = master;
        this.visit = 0;
    }

    public void takeMedicine() {
        System.out.println("소형견 " + name + " 약 복용");
    }

    public boolean visit(Master master, int currentHour) {
        if (currentHour < 15 || currentHour > 20) {
            System.out.println("면회 시간 아님");
            return false;
        }
        if (visit >= 1) {
            System.out.println("이미 오늘 면회함");
            return false;
        }
        visit++;
        System.out.println("면회 성공");
        return true;
    }
}
