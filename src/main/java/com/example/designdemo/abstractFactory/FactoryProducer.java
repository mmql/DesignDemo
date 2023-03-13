package com.example.designdemo.abstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("CAR")) {
            return new CarFactory();
        } else if (choice.equalsIgnoreCase("PERSON")) {
            return new PersonFactory();
        }
        return null;
    }
}
