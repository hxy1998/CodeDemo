package com.example.demo.线程.生成与消费;

import com.example.demo.线程.线程吃面包.Bread;
import org.junit.Test;

/**
 * @Author: hxy
 * @create: 2020/03/19/10:01
 */
public class ThreadTest {

    @Test
    public void get() throws InterruptedException {

        Bread bread = new Bread(0);

        Thread producer = new Thread(() -> {
                while (true) {
                    synchronized (bread) {
                        if (bread.getSize() < 10) {
                            bread.jiaSize();
                        } else {
                            try {
                                bread.wait();
                                bread.notifyAll();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
        });

        Thread consumer = new Thread(() -> {
                while (true){
                    synchronized (bread) {
                        if (bread.getSize() > 5) {
                            bread.jianSize();
                        } else {
                            try {
                                bread.wait();
                                bread.notifyAll();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
            }
        });
        producer.start();
        Thread.sleep(1000);
        consumer.start();
    }

}
