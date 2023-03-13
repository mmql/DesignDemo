package com.example.designdemo.proxy;

public class GreetImpl implements Greet {
    //委托类
    public String getName(int id) {
        System.out.println("------委托类的getName------");
        return "Tom";
    }

    public Integer getAge(int id) {
        System.out.println("------委托类的getAge------");
        return 10;
    }

}
