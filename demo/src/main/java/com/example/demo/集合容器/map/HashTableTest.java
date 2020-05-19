package com.example.demo.集合容器.map;

import org.junit.Test;

import java.util.Hashtable;
import java.util.Map;

/**
 * @Author: hxy
 * @create: 2020/03/18/11:18
 */
public class HashTableTest {

    /**
     * 无法存储null的键和值
     */
    @Test
    public void get(){

        Map map = new Hashtable();
        map.put(null,1);
        map.put(1,null);

    }

}
