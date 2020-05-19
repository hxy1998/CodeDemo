package com.example.demo.设计模式.工厂模式.工厂方法;

import org.junit.Test;

/**
 * @author Huang xing yuan
 * @date 2020-05-09-17:19
 */
public class FactoryTest {

    @Test
    public void get(){
        ShooterFactory shooterFactory = new ShooterFactory();
        MageFactory mageFactory = new MageFactory();
        shooterFactory.getHero().skill();
        mageFactory.getHero().skill();
    }

}
