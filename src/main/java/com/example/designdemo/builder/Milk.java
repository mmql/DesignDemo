package com.example.designdemo.builder;

public class Milk extends Drink {
    @Override
    public int price() {
        return 2;
    }

    @Override
    public String name() {
        return "Milk";
    }
}
