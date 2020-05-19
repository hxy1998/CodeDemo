package com.example.demo.设计模式.策略者模式;

/**
 * @Author: hxy
 * @create: 2020/03/12/10:03
 */
//普通用户
public class ServiceImpl_Two implements Commonality {
    @Override
    public void getText() {
        System.out.println("欢迎普通用户登录平台");
    }
}
