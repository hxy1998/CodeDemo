package com.example.demo.线程.多线程练习;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.Exchanger;

/**
 * @author Huang xing yuan
 * @date 2020-05-07-10:36
 */
public class ThreadDemo3 {

    public static void main(String[] args) throws Exception {
        new Thread(new Staff("大胖", new Util("笤帚", "扫地"), ex)).start();
        new Thread(new Staff("小白", new Util("抹布", "擦桌"), ex)).start();
        synchronized (ThreadDemo3.class) {
            ThreadDemo3.class.wait();
        }
    }

    static Exchanger<Util> ex = new Exchanger<>();

    @AllArgsConstructor
    static class Staff implements Runnable {

        String name;
        Util util;
        Exchanger<Util> ex;

        @Override
        public void run() {
            System.out.println(name + "拿的工具是" + util.name + "，他开始" + util.work + "。。。");
            //随机时间休眠
            Utils.doingLongTime();
            System.out.println(name + "开始交换工具");
            try {
                //互相交换对象
                util = ex.exchange(util);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(name + "的工具变为" + util.name + "，他开始" + util.work + "。。。");
        }
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    static class Util {
        String name;
        String work;
    }


}
