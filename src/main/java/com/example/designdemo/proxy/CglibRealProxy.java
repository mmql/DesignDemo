package com.example.designdemo.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibRealProxy implements MethodInterceptor {

    //要代理的原始对象
    private Object obj;

    CglibRealProxy() {

    }

    CglibRealProxy(Object obj) {
        this.obj = obj;
    }

    /**
     * 下面这个可以不写，在具体的业务类里写，但在这里写了的话，业务类直接调用比较方便
     * Enhancer允许为非接口类型创建一个代理，等同于用来创建代理proxy的一个类
     * 通过非常底层的字节码技术生成委托类子类的方式来创建代理类，jdk是建一个类，也去实现委托类实现的所有接口
     */
    public Object getProxy(Object obj) {
        this.obj = obj;
        Enhancer enhancer = new Enhancer();
        //设置代理目标，为即将得到的代理类设置父类即委托类
        enhancer.setSuperclass(this.obj.getClass());

        //设置回调，使enhancer能调用（）里的参数提供的方法，这里的this就指代该类自己CglibDailiHandler,设置单一回调对象，在回调中拦截对目标方法的调用
        enhancer.setCallback(this);
        //创建这个子类对象，返回的即是代理类
        return enhancer.create();
    }

    /**
     * intercept触发方法，定义方法的拦截器
     * Object：委托类的实例；Method：委托类方法的反射对象（即调用到委托类的这个方法，就会来调用代理，即调用下面的方法）；
     * Object[]：方法的参数；MethodProxy：代理类的实例,即子类
     */
    public Object intercept(Object obj, Method method, Object[] args,
                            MethodProxy proxy) throws Throwable {
        System.out.println("++++++before " + proxy.getSuperName() + "++++++");
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("++++++after " + proxy.getSuperName() + "++++++");
        return result;
    }

}
