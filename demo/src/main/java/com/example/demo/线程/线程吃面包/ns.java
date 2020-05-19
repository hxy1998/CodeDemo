package com.example.demo.线程.线程吃面包;

/**
 * @Author: hxy
 * @create: 2020/03/19/15:27
 */
public class ns implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("哈哈哈");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
