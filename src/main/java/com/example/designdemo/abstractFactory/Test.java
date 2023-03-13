package com.example.designdemo.abstractFactory;

public class Test {
    public static void main(String[] args) {
        // 跟 factory 方法比，就是工厂也是 通过工厂得到的
        AbstractFactory carFactory = FactoryProducer.getFactory("CAR");

        Car bike = carFactory.getCar("BIKE");
        bike.gotowork();
        Car bus = carFactory.getCar("BUS");
        bus.gotowork();

        AbstractFactory personFactory = FactoryProducer.getFactory("PERSON");

        Person student = personFactory.getPerson("STUDENT");
        student.who();
        Person teacher = personFactory.getPerson("TEACHER");
        teacher.who();

    }
}
