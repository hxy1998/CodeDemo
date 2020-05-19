package com.example.demo.线程.多线程练习;

import java.util.Random;

import static java.lang.Thread.sleep;

/**
 * @author Huang xing yuan
 * @date 2020-05-07-11:23
 */
public class Utils {

    public static void doingLongTime() {
        int second = random(5, 10);
        try {
            sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void doingLongTime(int second){
        try {
            sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int random(int min, int max) {
        return min + new Random().nextInt(max - min + 1);
    }


}
