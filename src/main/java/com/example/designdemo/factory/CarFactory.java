package com.example.designdemo.factory;

// 创建一个工厂，生成基于给定信息的实体类的对象。
public class CarFactory {

    //使用 getCar 方法获取 相应 对象
    public Car getCar(String carType) {
        if (carType == null) {
            return null;
        }
        if (carType.equalsIgnoreCase("BUS")) {
            return new Bus();
        } else if (carType.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }
        return null;
    }
}
