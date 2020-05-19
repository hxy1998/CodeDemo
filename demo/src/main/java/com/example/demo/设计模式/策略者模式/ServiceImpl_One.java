package com.example.demo.设计模式.策略者模式;

/**
 * @Author: hxy
 * @create: 2020/03/12/10:02
 */

//VIP会员
public class ServiceImpl_One implements Commonality{
    @Override
    public void getText() {
        System.out.println("欢迎VIP用户登录平台");
    }
}
