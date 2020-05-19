package com.example.demo.设计模式.装饰器模式;

/**
 * @author Huang xing yuan
 * @date 2020-05-19-11:24
 */
public abstract class Enhance implements Hero{

    protected Hero hero;

    public Enhance(Hero hero){
        this.hero = hero;
    }

    public void behavior(){
        hero.behavior();
    }

}
