package com.example.demo.线程.多线程练习;

import lombok.AllArgsConstructor;

import java.util.concurrent.CountDownLatch;

import static java.lang.Thread.sleep;

/**
 * @author Huang xing yuan
 * @date 2020-05-07-14:17
 */
public class ThreadDemo4 {

    //设置线程数量
    static final int COUNT = 20;

    //初始化一个等待线程数
    static CountDownLatch cdl = new CountDownLatch(COUNT);

    public static void main(String[] args) throws Exception{
        new Thread(new Teacher(cdl)).start();
        sleep(1000);
        for (int i = 0; i < COUNT; i++) {
            Utils.doingLongTime();
            new Thread(new Student(cdl,i + 1)).start();
        }
    }

    @AllArgsConstructor
    static class Teacher implements Runnable{

        CountDownLatch cdl;

        @Override
        public void run() {
            System.out.println("开始发试卷");
            try {
                cdl.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("考试结束，开始收卷");
        }
    }

    @AllArgsConstructor
    static class Student implements Runnable{

        CountDownLatch cdl;
        int num;

        @Override
        public void run() {
            System.out.println("学生" + num + "写试卷");
            Utils.doingLongTime(1000);
            System.out.println("学生" + num + "交试卷");
            cdl.countDown();
        }
    }
}
