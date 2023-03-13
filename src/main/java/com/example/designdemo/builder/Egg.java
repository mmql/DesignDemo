package com.example.designdemo.builder;

public class Egg extends Food {
    @Override
    public int price() {
        return 3;
    }

    @Override
    public String name() {
        return "Egg";
    }
}
