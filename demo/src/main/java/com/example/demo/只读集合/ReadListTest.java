package com.example.demo.只读集合;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: hxy
 * @create: 2020/03/10/10:56
 */
public class ReadListTest implements Runnable{

    public static void main(String[] args) {
//        ReadListTest test1 = new ReadListTest();
//        ReadListTest test2 = new ReadListTest();
//        test1.run();
//        test2.run();
        ConcurrentHashMap map = new ConcurrentHashMap();
        map.put("one",1);
        map.put("33",33);
        map.put("666",999);


    }


    @Override
    public void run() {

    }
}
