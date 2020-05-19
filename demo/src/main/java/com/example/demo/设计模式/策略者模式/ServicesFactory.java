package com.example.demo.设计模式.策略者模式;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hxy
 * @create: 2020/03/12/10:04
 */
public class ServicesFactory {

    private static final Map<String, Commonality> map = new HashMap<>();

    static {
        map.put("VIP",new ServiceImpl_One());
        map.put("普通",new ServiceImpl_Two());
        map.put("SVIP",new ServiceImpl_Three());
    }

    public static Commonality getLevel(String level){
        return map.get(level);
    }

}
