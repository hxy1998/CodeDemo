package com.example.demo.线程.多线程练习;

import lombok.AllArgsConstructor;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author Huang xing yuan
 * @date 2020-05-07-14:42
 */
public class ThreadDemo5 {

    static final Integer COUNT = 5;

    //初始化一个等待线程，最后一个线程执行一个线程任务
    static CyclicBarrier cb = new CyclicBarrier(COUNT, new Singer());

    public static void main(String[] args) {
        for (int i = 0; i < COUNT; i++) {
            new Thread(new Staff(cb,i + 1)).start();
        }
    }

    static class Singer implements Runnable{
        @Override
        public void run() {
            System.out.println("开始为大家唱歌");
        }
    }

    @AllArgsConstructor
    static class Staff implements Runnable{

        CyclicBarrier cb;
        int num;

        @Override
        public void run() {
            System.out.println("员工" + num + "开始出发");
            Utils.doingLongTime();
            System.out.println("员工" + num + "到达半山腰");

            try {
                //等待队友到达
                cb.await();
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("员工" + num + "再次出发");
            Utils.doingLongTime();
            System.out.println("员工" + num + "到达山顶");

            try {
                //等待队友到达
                cb.await();
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("员工" + num + "开始下山");
            Utils.doingLongTime();
            System.out.println("员工" + num + "到达山脚");

            try {
                //等待队友到达
                cb.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("员工"+ num + "完成爬山任务");
        }
    }


}
