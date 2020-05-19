package com.example.demo.设计模式.单列模式;

/**
 * @Author: hxy
 * @create: 2020/03/05/11:04
 */
public class PassObject {

    private PassObject() { }

    private static final ThreadLocal<PassObject> ins = new ThreadLocal<PassObject>(){
        @Override
        protected PassObject initialValue() {
            return new PassObject();
        }
    };

    public static  PassObject getObject(){
        return ins.get();
    }

}
