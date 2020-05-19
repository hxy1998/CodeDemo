package com.example.demo.线程.多线程练习;

import lombok.AllArgsConstructor;

import static java.lang.Thread.sleep;

/**
 * @author Huang xing yuan
 * @date 2020-05-07-12:04
 */
public class ThreadDemo1 {

    public static void main(String[] args) throws Exception{
        BrRun br1 = new BrRun("小明");
        Thread thread1 = new Thread(br1);
        thread1.start();
        sleep(1);
        try {
            System.out.println("小红对小明说  我比较急插个队。。。");
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("到小明了");
    }


    @AllArgsConstructor
    static class BrRun implements Runnable{

        String name;

        @Override
        public void run() {
            System.out.println("开始办理");
            Utils.doingLongTime(2000);
            System.out.println("办理成功");
        }
    }


}
