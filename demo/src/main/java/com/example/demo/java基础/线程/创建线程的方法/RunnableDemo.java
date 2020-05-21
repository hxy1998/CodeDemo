package com.example.demo.java基础.线程.创建线程的方法;

/**
 * @author Huang xing yuan
 * @date 2020-05-21-9:50
 */
public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello 使用实现Runnable创建线程");
    }
}
