package com.example.designdemo.prototype;

public class Teacher extends Person {
    public Teacher() {
        name = "ITeacher";
    }

    @Override
    void work() {
        System.out.println("Car 去上班！");
    }
}
