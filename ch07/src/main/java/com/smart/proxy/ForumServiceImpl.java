package com.smart.proxy;

/**
 * @Title：ForumServiceImpl
 * @Description:
 * @Author: natty
 * @Version: 1.0
 * @Date: 2019-05-27 10:58
 */
public class ForumServiceImpl implements ForumService {
    public void removeTopic(int topicId) {
        PerformanceMonitor.begin("com.smart.proxy.ForumServiceImpl.removeTopic");
        System.out.println("模拟删除Topic记录：" + topicId);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        PerformanceMonitor.end();
    }

    public void removeForum(int forumId) {
        PerformanceMonitor.begin("com.smart.proxy.ForumServiceImpl.removeForum");
        System.out.println("模拟删除论坛" + forumId);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        PerformanceMonitor.end();
    }
}
