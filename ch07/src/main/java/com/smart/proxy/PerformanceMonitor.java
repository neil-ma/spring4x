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
    //ThreadLocal用于保存某个线程共享变量：对于同一个static ThreadLocal，不同线程只能从中get，set，remove自己的变量，而不会影响其他线程的变量。
    private static ThreadLocal<MethodPerformance> performanceRecord = new ThreadLocal();

    public static void begin(String serviceMethod){
        System.out.println("start to monitor "+ serviceMethod + "...");
        MethodPerformance mp  = new MethodPerformance(serviceMethod);
        performanceRecord.set(mp);
    }

    public static void end(){
        System.out.println("end monitor...");
        MethodPerformance mp = performanceRecord.get();
        mp.printPerformance();
    }

}
