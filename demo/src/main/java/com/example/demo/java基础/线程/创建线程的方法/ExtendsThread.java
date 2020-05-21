package com.example.demo.java基础.线程.创建线程的方法;

/**
 * @author Huang xing yuan
 * @date 2020-05-21-9:53
 */
public class ExtendsThread extends Thread{

    @Override
    public void run() {
        System.out.println("Hello 使用继承Thread创建线程");
    }


}
