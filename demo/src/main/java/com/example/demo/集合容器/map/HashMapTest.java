package com.example.demo.集合容器.map;

import com.example.demo.comm.Comm;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hxy
 * @create: 2020/03/18/11:14
 */
public class HashMapTest {

    /**
     * 可以存储null的键和值
     */
    @Test
    public void get(){
        HashMap map = new HashMap();
        Comm comm1 = null;
        Comm comm2 = null;
        map.put(comm1,null);
        map.put(comm2,null);
        System.out.println(map);


    }

}
