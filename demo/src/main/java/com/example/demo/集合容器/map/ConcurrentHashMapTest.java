package com.example.demo.集合容器.map;

import com.example.demo.comm.Comm;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Huang xing yuan
 * @date 2020-05-08-11:40
 */
public class ConcurrentHashMapTest {


    /**
     * 不可以存储null的键和值
     */
    @Test
    public void get(){
        Map map = new ConcurrentHashMap();
        map.put(1,1);


    }


}
