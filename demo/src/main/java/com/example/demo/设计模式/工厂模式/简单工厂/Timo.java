package com.example.demo.设计模式.工厂模式.简单工厂;

/**
 * @author Huang xing yuan
 * @date 2020-05-09-17:11
 */
public class Timo implements Hero{

    @Override
    public void skill() {
        System.out.println("提莫：使用了剧毒吹箫");
    }

    @Override
    public void buy() {
        System.out.println("成功购买英雄：提莫");
    }

}
