package com.mjc813;

public class GenericExample2 {
    public void ch06() {
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLigh();

        CarAgency carAgency = new CarAgency();
        Car1 car = carAgency.rent();
        car.run();
    }
}
