package com.example.demo.Spring框架.AOP;

/**
 * @author Huang xing yuan
 * @date 2020-05-06-11:34
 */
public class People implements Bork{

    @Override
    public void getBork1() {
        System.out.println("有人浏览了博客一");
    }

    @Override
    public void getBork2() {
        System.out.println("有人浏览了博客二");
    }

}
