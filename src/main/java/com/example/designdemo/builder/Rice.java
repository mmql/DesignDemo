package com.example.designdemo.builder;

public class Rice extends Food {
    @Override
    public int price() {
        return 1;
    }

    @Override
    public String name() {
        return "Rice";
    }
}
