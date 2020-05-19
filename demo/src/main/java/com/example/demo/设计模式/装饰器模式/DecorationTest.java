package com.example.demo.设计模式.装饰器模式;

/**
 * @author Huang xing yuan
 * @date 2020-05-19-11:32
 */
public class DecorationTest {
    public static void main(String[] args) {
        Physical physical = new Physical(new Spell());
        physical.behavior();
    }
}
