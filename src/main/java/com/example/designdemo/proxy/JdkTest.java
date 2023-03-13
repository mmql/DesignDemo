package com.example.designdemo.proxy;

import java.lang.reflect.Proxy;

public class JdkTest {

    public static void main(String[] args) {
        Greet weituolei = new GreetImpl();    //指定委托类
        JdkRealProxy proxy = new JdkRealProxy(weituolei);           //对委托类创建动态代理
        /**
         * 第一个参数：将刚刚创建的委托类副本加载到jvm中去
         * 第二个参数：接口，即得到委托类的所有实现的接口，然后动态生成一个类，也去实现委托类所实现的所有接口
         * 第三个参数：创建的动态代理
         * userServiceProxy就是实际的代理
         */
        Greet userServiceProxy = (Greet) Proxy.newProxyInstance(weituolei.getClass().getClassLoader(),
                weituolei.getClass().getInterfaces(), proxy);
        userServiceProxy.getAge(1);
        userServiceProxy.getName(2);

    }
}
