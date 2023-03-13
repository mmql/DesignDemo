package com.example.designdemo.prototype;

public class Student extends Person {
    public Student() {
        name = "Student";
    }

    @Override
    void work() {
        System.out.println("Bus 去上班！");
    }
}
