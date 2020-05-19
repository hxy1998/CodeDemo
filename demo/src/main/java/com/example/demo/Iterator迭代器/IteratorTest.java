package com.example.demo.Iterator迭代器;

import org.junit.Test;

import java.util.*;

/**
 * @Author: hxy
 * @create: 2020/03/10/16:22
 */
public class IteratorTest {

    @Test
    public void test1() {
        List list = Arrays.asList(1,2,3,4,5,6,7);
        Iterator it = list.iterator();
        while (it.hasNext()){
            Integer integer = Integer.parseInt(it.next().toString());
            list.remove(integer);
//            System.out.println(integer);
        }
    }

    @Test
    public void test2() {
        List list = Arrays.asList(1,2,3,4,5);
        List<Integer> synchronizedList = Collections.synchronizedList(list);
    }

}
