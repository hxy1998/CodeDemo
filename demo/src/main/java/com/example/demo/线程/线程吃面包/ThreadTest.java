package com.example.demo.线程.线程吃面包;

import org.junit.Test;

/**
 * @Author: hxy
 * @create: 2020/03/19/10:01
 */
public class ThreadTest {

    @Test
    public void get(){

        Bread bread = new Bread(0);

        Thread producer = new Thread(() -> {
            synchronized (bread) {
                while (true) {
                    if (bread.getSize() > 9) {
                        System.out.println("锅已经有10个面包，等待吃面包");
                        try {
                            bread.notify();
                            bread.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    bread.jiaSize();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        });
        Thread consumer = new Thread(() -> {
            synchronized (bread) {
                while (true) {
                    if (bread.getSize() == 0) {
                        try {
                            System.out.println("锅已经没有面包，等待做面包");
                            bread.notify();
                            bread.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    bread.jianSize();
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        producer.start();
        consumer.start();

        while (true){

        }
    }

}
