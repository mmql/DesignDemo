package com.example.designdemo.abstractFactory;

public class CarFactory extends AbstractFactory {

    @Override
    public Person getPerson(String who) {
        return null;
    }

    @Override
    public Car getCar(String carType) {
        if (carType == null) {
            return null;
        }
        if (carType.equalsIgnoreCase("BUS")) {
            return new Bus();
        } else if (carType.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }
        return null;
    }

}
