package com.example.demo.线程状态的基本操作;

/**
 * @Author: hxy
 * @create: 2020/03/09/16:18
 */
public class InterruptDemo {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() ->{
            while (true) {
                System.out.println("打他妈的香蕉牛奶棒棒糖");
                if (Thread.interrupted()) {
                    System.out.println("哦豁 被抓住了");
                    break;
                }
            }
        });

        Thread thread2 = new Thread(() -> thread1.interrupt());

        thread1.start();
        Thread.sleep(1000);
        thread2.start();
        synchronized (InterruptDemo.class) {
            InterruptDemo.class.wait();
        }
    }




}
