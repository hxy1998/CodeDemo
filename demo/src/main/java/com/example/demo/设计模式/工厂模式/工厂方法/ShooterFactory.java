package com.example.demo.设计模式.工厂模式.工厂方法;

/**
 * @author Huang xing yuan
 * @date 2020-05-09-17:24
 */
public class ShooterFactory extends HeroMallFactory{

    @Override
    protected Hero getHero() {
        return new Ash();
    }

}
