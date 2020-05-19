package com.example.demo.线程.多线程练习;

import static java.lang.Thread.sleep;

/**
 * @author Huang xing yuan
 * @date 2020-05-07-11:32
 */
public class ThreadDemo2 {

    public static void main(String[] args) throws Exception{
        BRunnable br = new BRunnable();
        new Thread(br).start();
        br.pause();
        sleep(3000);
        System.out.println("主线程发出恢复指令");
        br.play();
    }

    static class BRunnable implements Runnable{

        volatile Boolean is;

        public void pause(){
            is = true;
        }

        public void play(){
            synchronized (this){
                notify();
            }
        }

        @Override
        public void run(){
            System.out.println("开始执行不可暂停任务");
            //执行时间设置
            Utils.doingLongTime(1000);
            System.out.println("完成不可暂停任务");
            if (is){
                System.out.println("收到异常指令，取消执行接下来的任务");
                synchronized (this){
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("收到恢复指令，恢复正常执行");
            }
            System.out.println("开始执行不可暂停任务");
            //执行时间设置
            Utils.doingLongTime();
            System.out.println("完成不可暂停任务");
        }
    }
}
