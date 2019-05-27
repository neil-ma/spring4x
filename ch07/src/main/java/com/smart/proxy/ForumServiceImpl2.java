package com.smart.proxy;


/***
 * 根据ForumServiceImpl类建立，但是我们需要将监控的逻辑，横切出来，并使用JDK动态代理来实现。
 *
 */

public class ForumServiceImpl2 implements ForumService {

    public void removeTopic(int topicId) {
       // PerformanceMonitor.begin("com.smart.proxy.ForumServiceImpl.removeTopic");       //抽取出横切逻辑，准备放到外部统一执行
        System.out.println("模拟删除Topic记录" + topicId);   //业务代码
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // PerformanceMonitor.end();
    }

    public void removeForum(int forumId) {
        System.out.println("模拟删除论坛" + forumId);    //业务代码
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
