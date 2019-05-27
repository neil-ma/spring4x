package com.smart.proxy;

/**
 * @Title：PerformanceMonitor
 * @Description:   关于 ThreadLocal : https://www.cnblogs.com/coshaho/p/5127135.html
 * @Author: natty
 * @Version: 1.0
 * @Date: 2019-05-27 11:07
 */
public class PerformanceMonitor {

    //保存与调用线程相关的性能监视信息。
    private static ThreadLocal<MethodPerformance> performanceRecord = new ThreadLocal();

    public static void begin(String serviceMethod){
        System.out.println("start to monitor "+ serviceMethod + "...");
        MethodPerformance mp  = new MethodPerformance(serviceMethod);
        performanceRecord.set(mp);
    }

    public static void end(){
        System.out.println("end monitor...");
        MethodPerformance mp = performanceRecord.get();

    }

}
