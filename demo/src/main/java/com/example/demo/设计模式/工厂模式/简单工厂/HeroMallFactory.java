package com.example.demo.设计模式.工厂模式.简单工厂;

/**
 * @author Huang xing yuan
 * @date 2020-05-09-17:12
 */
public class HeroMallFactory {

    public static Hero getHero(String heroName) {
        if (heroName == null){
            return null;
        }
        if (heroName.equals("Ash")){
            return new Ash();
        }
        if (heroName.equals("Timo")){
            return new Timo();
        }
        return null;
    }
}
