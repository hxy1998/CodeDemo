package com.example.demo.同步锁;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Huang xing yuan
 * @date 2020-05-12-17:26
 */
public class DemoTest {

    public static void main(String[] args) throws Exception{
        SynchronizedTest test = new SynchronizedTest("张三",25000);

        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    test.AddCount(1000);
                    test.reduceCount(500);
                }
            },"线程"+ i +1).start();
        }
        Thread.sleep(5000);
        System.out.println(test);
    }


}
