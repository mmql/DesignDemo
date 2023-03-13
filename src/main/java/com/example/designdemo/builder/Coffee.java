package com.example.designdemo.builder;

public class Coffee extends Drink {
    @Override
    public int price() {
        return 4;
    }

    @Override
    public String name() {
        return "Coffee";
    }
}
