package com.smart.proxy;

public class TestForumService {
    public static void main(String[] args) {
        ForumServiceImpl impl = new ForumServiceImpl();
        impl.removeForum(20);
        impl.removeTopic(2000);
    }
}
