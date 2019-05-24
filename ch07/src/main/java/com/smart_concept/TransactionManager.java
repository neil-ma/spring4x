package com.smart_concept;

/**
 * @Title：TransactionManager
 * @Description:  接口中的方法默认为public  abstract类型，这由接口的性质决定，可以省略。
 *                  就像本接口定义中，直接void commit() 即可。
 * @Author: natty
 * @Version: 1.0
 * @Date: 2019-05-24 11:29
 */
public interface TransactionManager {
    void beginTransaction();
    void commit();
}
