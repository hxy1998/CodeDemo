package com.example.demo.集合容器.map;

import org.junit.Test;
import java.util.LinkedHashMap;

import java.util.Map;

/**
 * @Author: hxy
 * @create: 2020/03/18/11:08
 */
public class LinkedHashMapTest {

    /**
     * 可以存储null的键和值
     */
    @Test
    public void get(){
        Map map = new LinkedHashMap();
        map.put(null,null);
        map.put(null,1);
        map.put(null,3);
        map.put(null,null);
        System.out.println(map);


    }

}
