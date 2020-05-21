package com.example.demo.java基础.线程.创建线程的方法;

import java.util.concurrent.FutureTask;

/**
 * @author Huang xing yuan
 * @date 2020-05-21-9:51
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //实现Runnable接口
        new Thread(new RunnableDemo()).start();
        //继承Thread重写Run方法
        new ExtendsThread().start();
        //实现Callable接口
        CallableDemo clb = new CallableDemo();
        FutureTask task = new FutureTask(clb);
        new Thread(task).start();
    }
}
