package com.example.demo.设计模式.工厂模式.工厂方法;

/**
 * @author Huang xing yuan
 * @date 2020-05-09-17:33
 */
public class Casa implements Hero{
    @Override
    public void skill() {
        System.out.println("卡莎：使用了虚空行走");
    }

    @Override
    public void buy() {
        System.out.println("成功购买英雄：卡莎");
    }
}
