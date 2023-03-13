package com.example.designdemo.proxy;

import net.sf.cglib.proxy.Enhancer;

public class CglibTest {
    public static void main(String[] args) {
        CglibRealProxy dailileihandler = new CglibRealProxy();

/**
 *   Enhancer允许为非接口类型创建一个Java代理。Enhancer动态创建了给定类型的子类但是拦截了所有的方法。
 *   和Proxy不一样的是，不管是接口还是类他都能正常工作。
 */
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(GreetImpl.class);
        enhancer.setCallback(dailileihandler);

        /**
         * userServiceProxy就是实际的代理，enhancer.create()方法就是用来创建代理对象的
         */
        Greet userServiceProxy = (Greet) enhancer.create();
        userServiceProxy.getName(1);
        userServiceProxy.getAge(1);
    }
}
