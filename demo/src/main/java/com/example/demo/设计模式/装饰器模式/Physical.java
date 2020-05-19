package com.example.demo.设计模式.装饰器模式;

/**
 * @author Huang xing yuan
 * @date 2020-05-19-11:27
 */
public class Physical extends Enhance{

    public Physical(Hero hero){
        super(hero);
    }

    @Override
    public void behavior() {
        System.out.println("物理攻击");
        super.behavior();
    }

}
