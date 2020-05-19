package com.example.demo.线程.死锁;

/**
 * @author Huang xing yuan
 * @date 2020-04-26-11:07
 */
public class DeadlockTest {

    private static String temp1 = "资源1";

    private static String temp2 = "资源2";

    public static void main(String[] args) {


        new Thread(() -> {
                synchronized (temp1){
                    System.out.println(Thread.currentThread().getName() + "：获取到" + temp1);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println(Thread.currentThread().getName() + "：尝试获取到" + temp2);
                    synchronized (temp2){
                        System.out.println(Thread.currentThread().getName() + "：获取到" + temp2);
                    }
                }
        }, "线程1").start();

//        new Thread(() -> {
//                synchronized (temp2){
//                    System.out.println(Thread.currentThread().getName() + "：获取到资源2");
//                    System.out.println(Thread.currentThread().getName() + "：尝试获取资源1");
//                    synchronized (temp1){
//                        System.out.println(Thread.currentThread().getName() + "：尝试获取资源1");
//                    }
//                }
//        }, "线程2").start();

        new Thread(() -> {
                synchronized (temp1){
                    System.out.println(Thread.currentThread().getName() + "：获取到" + temp1);
                    System.out.println(Thread.currentThread().getName() + "：尝试获取" + temp2);
                    synchronized (temp2){
                        System.out.println(Thread.currentThread().getName() + "：获取到" + temp2);
                    }
                }
        }, "线程2").start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
