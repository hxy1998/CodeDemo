package com.example.demo.设计模式.工厂模式.简单工厂;

import org.junit.Test;

/**
 * @author Huang xing yuan
 * @date 2020-05-09-17:19
 */
public class FactoryTest {

    @Test
    public void get(){
        Hero ash = HeroMallFactory.getHero("Ash");
        ash.skill();
    }


}
