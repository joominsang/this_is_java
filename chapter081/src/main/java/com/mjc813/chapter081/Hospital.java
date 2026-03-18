package com.mjc813.chapter081;

public class Hospital {
    private int currentHour;
    private Object[] patients;
    private Doctor[] doctors;
    private Nurse mainNurse;

    public Hospital(Nurse nurse) {
        this.mainNurse = nurse;
        this.patients = new Object[10];
        this.doctors = new Doctor[5];
    }

    public boolean intoHospital(Object animal) {
        System.out.println("입원");
        return true;
    }

    public void giveMedicineAnimals() {
        System.out.println("병원이 동물에게 약을 줍니다.");
    }

    public void meetAnimal(Master master, Object animal) {
        System.out.println("주인이 동물을 면회합니다.");
    }
}
