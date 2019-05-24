package com.smart_concept;


/**
 * @Title：ForumService
 * @Description:
 * @Author: natty
 * @Version: 1.0
 * @Date: 2019-05-23 20:01
 */
public class ForumService {

    private TransactionManager transManager;
    private PerformanceManager pmonitor;
    private ForumDao forumDao;
    private TopicDao topicDao;

    public void removeTopic(int topicId){
        pmonitor.start();
        transManager.beginTransaction();
        topicDao.removeTopic(topicId);       // 业务逻辑代码
        transManager.commit();
        pmonitor.end();
    }

    public void createForum(Forum forum){
        pmonitor.start();
        transManager.beginTransaction();
        forumDao.create(forum);              // 业务逻辑代码
        transManager.commit();
        pmonitor.end();
    }
}
