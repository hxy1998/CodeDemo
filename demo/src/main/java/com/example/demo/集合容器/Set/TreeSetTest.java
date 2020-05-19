package com.example.demo.集合容器.Set;

import org.junit.Test;

import java.util.Iterator;
import java.util.SortedSet;

/**
 * @Author: hxy
 * @create: 2020/03/12/15:43
 */
public class TreeSetTest {

    @Test
    public void get2(){
        java.util.TreeSet treeSet = new java.util.TreeSet();
        treeSet.add("Jack");
        treeSet.add("Tom");
        treeSet.add("Mybatis");
        treeSet.add("Boss");
        treeSet.add("Swagger");

        System.out.println("遍历升序(默认)");
        Iterator iterator1 = treeSet.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        System.out.println("遍历降序(降序)");
        Iterator iterator2 = treeSet.descendingIterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        System.out.println("元素获取:实现NavigableSet接口所获得的功能");
        String first = treeSet.first().toString();
        System.out.println(first);

        System.out.println("获取指定元素之前的所有元素集合：(不包含指定元素)");
        SortedSet mybatis = treeSet.headSet("Mybatis");
        System.out.println(mybatis.toString());

        System.out.println("获取给定元素之间的集合：（包含头，不包含尾）");
        SortedSet sortedSet = treeSet.subSet("Jack", "Swagger");
        System.out.println(sortedSet);



    }
}
