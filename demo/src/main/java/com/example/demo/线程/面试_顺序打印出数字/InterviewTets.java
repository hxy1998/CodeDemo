package com.example.demo.线程.面试_顺序打印出数字;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: hxy
 * @create: 2020/03/16/16:04
 */
public class InterviewTets implements Runnable{

    static int count;

    @Override
    public void run() {
        synchronized (InterviewTets.class) {
            count++;
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new InterviewTets());
        Thread thread2 = new Thread(new InterviewTets());
        Thread thread3 = new Thread(new InterviewTets());
        Thread thread4 = new Thread(new InterviewTets());
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
