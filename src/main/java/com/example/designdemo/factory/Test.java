package com.example.designdemo.factory;

public class Test {
    public static void main(String[] args) {
        // 使用该工厂，通过传递类型信息来获取实体类的对象。
        CarFactory carFactory = new CarFactory();

        Car bike = carFactory.getCar("BIKE");
        bike.gotowork();

        Car bus = carFactory.getCar("BUS");
        bus.gotowork();

    }
}
