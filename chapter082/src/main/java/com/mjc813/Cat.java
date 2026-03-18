package com.mjc813;

import java.time.LocalDate;

public class Cat extends Animal {
    public Cat(String name, String id, LocalDate inhospital, Doctor doctor, Master master) {
        super(name, id, inhospital, master, doctor);
    }
    @Override
    public void takeMedicine() {
        System.out.println("고양이" + name + "약 복용함");
    }
}
