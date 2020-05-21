package com.example.demo.java基础.线程.创建线程的方法;

import java.util.concurrent.Callable;

/**
 * @author Huang xing yuan
 * @date 2020-05-21-9:57
 */
public class CallableDemo implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Hello 使用实现Callable创建线程");
        return null;
    }
}
