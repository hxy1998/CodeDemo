package com.example.demo.jdk自带工具类.集合工具类;

import org.junit.Test;

import java.util.*;

public class CollectionsTest {

    @Test
    public void test(){
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List list1 = list.subList(0, 2);
        list1.set(1,10);
        list.set(0,20);
        System.out.println(list1);
        System.out.println(list);

//        //反转
//        Collections.reverse(list);
//        System.out.println(list);
//
//        //默认升序
//        Collections.sort(list);
//        System.out.println(list);





    }



}
