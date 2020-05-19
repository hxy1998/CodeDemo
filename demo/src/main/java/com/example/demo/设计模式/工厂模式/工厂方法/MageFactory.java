package com.example.demo.设计模式.工厂模式.工厂方法;

/**
 * @author Huang xing yuan
 * @date 2020-05-09-17:25
 */
public class MageFactory extends HeroMallFactory{

    @Override
    protected Hero getHero() {
        return new Timo();
    }

}
