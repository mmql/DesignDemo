package com.example.designdemo.abstractFactory;

public class PersonFactory extends AbstractFactory {

    @Override
    public Person getPerson(String who) {
        if (who == null) {
            return null;
        }
        if (who.equalsIgnoreCase("STUDENT")) {
            return new Student();
        } else if (who.equalsIgnoreCase("TEACHER")) {
            return new Teacher();
        }
        return null;
    }

    @Override
    public Car getCar(String carType) {
        return null;
    }

}
