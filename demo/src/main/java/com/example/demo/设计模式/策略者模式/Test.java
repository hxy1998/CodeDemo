package com.example.demo.设计模式.策略者模式;

import org.springframework.beans.factory.serviceloader.ServiceFactoryBean;

/**
 * @Author: hxy
 * @create: 2020/03/12/10:08
 */
public class Test {

    public static void main(String[] args) {
        ServicesFactory.getLevel("SVIP").getText();

    }

}
