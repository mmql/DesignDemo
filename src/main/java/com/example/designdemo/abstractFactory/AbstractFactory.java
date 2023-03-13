package com.example.designdemo.abstractFactory;

public abstract class AbstractFactory {
    public abstract Person getPerson(String who);

    public abstract Car getCar(String carType);
}
