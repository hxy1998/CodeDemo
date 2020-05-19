package com.example.demo.设计模式.工厂模式.简单工厂;

/**
 * @author Huang xing yuan
 * @date 2020-05-09-17:10
 */
public class Ash implements Hero{
    @Override
    public void skill() {
        System.out.println("艾希：使用了水晶箭");
    }

    @Override
    public void buy() {
        System.out.println("成功购买英雄：艾希");
    }
}
