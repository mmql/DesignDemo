package com.example.designdemo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类都必须实现InvocationHandler接口，这个接口会提供
 */
public class JdkRealProxy implements InvocationHandler {

    private Object obj;

    JdkRealProxy(Object obj) {
        this.obj = obj;
    }     //构造方法

    /**
     * 这个是InvocationHandler接口的抽象方法，每个代理类对其实现
     * invoke  通过invoke方法利用java的反射机制实现对相关方法的监听。
     * Object：被代理的对象，即委托类；Method：拦截的方法；Object[]:方法调用时需要的参数
     */
    public Object invoke(Object arg0, Method method, Object[] arg2) throws Throwable {
        System.out.println("++++++before " + method.getName() + "++++++");
        Object result = method.invoke(obj, arg2);
        System.out.println("++++++after " + method.getName() + "++++++");
        return result;
    }

}
