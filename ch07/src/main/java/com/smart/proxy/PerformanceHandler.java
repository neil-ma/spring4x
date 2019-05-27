package com.smart.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 关于java动态代理：  https://blog.csdn.net/yaomingyang/article/details/80981004
 * java动态代理机制中有两个重要的类和接口InvocationHandler（接口）和Proxy（类），这一个类Proxy和接口InvocationHandler是我们实现动态代理的核心；
 *
 * 每一个动态代理类的调用处理程序都必须实现InvocationHandler接口，并且每个代理类的实例都关联到了实现该接口的动态代理类调用处理程序中，
 * 当我们通过动态代理对象调用一个方法时候，这个方法的调用就会被转发到实现InvocationHandler接口类的invoke方法来调用
 *
 * 这个例子中，代理类是PerformanceHandler， 而实际上要代理的业务类是 ForumServiceImpl2类。
 * 在invoke方法实现公共提取的横切逻辑。
 *
 */

public class PerformanceHandler implements InvocationHandler{
    private Object obj;

    public PerformanceHandler(Object obj) {
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        PerformanceMonitor.begin("start to monitor " + obj.getClass().getName() + "," + method.getName() + "...");
        Object obj_out =  method.invoke(obj,method);
        PerformanceMonitor.end();
        return obj_out;
    }
}