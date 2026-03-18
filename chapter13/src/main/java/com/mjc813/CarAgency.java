package com.mjc813;

public class CarAgency implements Rentable<Car1> {
    @Override
    public Car1 rent() {
        return new Car1();
    }
}
