package com.example.designdemo.prototype;

public class Test {
    public static void main(String[] args) {
        PersonCache.loadCache();

        Person clonedShape = PersonCache.getPerson("1");
        System.out.println("Person : " + clonedShape.getName());
        clonedShape.work();

        Person clonedShape2 = PersonCache.getPerson("2");
        System.out.println("Person : " + clonedShape2.getName());
        clonedShape2.work();

    }
}
