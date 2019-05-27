package com.smart.proxy;

/**
 * @Title：MethodPerformance
 * @Description:
 * @Author: natty
 * @Version: 1.0
 * @Date: 2019-05-27 11:19
 */
public class MethodPerformance {

    private long begin;
    private long end;
    private String serviceMethod;

    public MethodPerformance(String serviceMethod) {
        this.begin = System.currentTimeMillis();
        this.serviceMethod = serviceMethod;
    }

    public void printPerformance(){
        this.end = System.currentTimeMillis();
        long elapse =  end - begin;
        System.out.println( "执行方法" + serviceMethod + " 总共花费了" + elapse + "秒" );
    }
}
