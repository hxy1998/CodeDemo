package com.example.demo.设计模式.单列模式;

import com.example.demo.设计模式.单列模式.PassObject;

/**
 * @Author: hxy
 * @create: 2020/03/05/11:09
 */
public class main {

    public static void main(String[] args) {
        PassObject object1 = PassObject.getObject();
        PassObject object2 = PassObject.getObject();
        System.out.println(object1);
        System.out.println(object2);
    }

}
