package com.mjc813.chapter081;

public class Nurse {
    private String name;

    public Nurse(String name) {
        this.name = name;
    }

    public void giveMedicine(Object animal) {
            System.out.println("간호사가 약을 준다.");
        }

        public boolean allowVisit(Master master, Object animal) {
            System.out.println("간호사가 면회를 허락함.");
            return true;
        }
    }
