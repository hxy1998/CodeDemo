package com.example.demo.集合容器.list;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author: hxy
 * @create: 2020/03/16/15:22
 */
public class CopyOnWriteArrayListTets {

    /**
     * 线程安全 (极端情况下可能会不安全)
     * 1.读操作不会阻塞
     * 2.写操作不会操作原数据而是先拷贝副本进行操作后同步到原数据
     * 缺点: 因为每次写操作都会去拷贝数据比较消耗内存
     * 优点: 可以应用在读多写少的应用场景中
     */
    @Test
    public void get(){
        Set set = new LinkedHashSet<>();
        CopyOnWriteArrayList list = new CopyOnWriteArrayList();
        list.add(20);
        list.add(20);
        list.add(20);
        System.out.println(list);
    }

    @Test
    public void get2(){
        List list = new CopyOnWriteArrayList();
        for(int i = 0; i<10000; i++){
            list.add("string" + i);
        }

        //读线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    if (list.size() > 0){
                        System.out.println(list.get(list.size() - 1));
                    }else {
                        break;
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (list.size() <= 0) {
                        break;
                    }
                    list.remove(0);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }


}
