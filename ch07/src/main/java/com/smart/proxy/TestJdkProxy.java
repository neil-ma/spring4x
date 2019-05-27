package com.smart.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestJdkProxy {
    public static void main(String[] args) {
        ForumService fs = new ForumServiceImpl2();
        InvocationHandler ph =  new PerformanceHandler(fs);
        /**
         * 通过Proxy类的newProxyInstance方法创建代理对象，我们来看下方法中的参数
         * 第一个参数：使用handler对象的classloader对象来加载我们的代理对象
         * 第二个参数：people.getClass().getInterfaces()，这里为代理类提供的接口是真实对象实现的接口，这样代理对象就能像真实对象一样调用接口中的所有方法
         * 第三个参数：handler，我们将代理对象关联到上面的InvocationHandler对象上
         */
        ForumService proxy = (ForumService) Proxy.newProxyInstance(ph.getClass().getClassLoader(),fs.getClass().getInterfaces(),ph);
        proxy.removeForum(2000);
        proxy.removeTopic(4000);
    }
}
