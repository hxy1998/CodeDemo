package com.example.demo.多条件判断优化;

import org.junit.Test;

import java.util.Optional;

/**
 * @Author: hxy
 * @create: 2020/03/12/9:22
 */
public class IfelseSimplifyTets {

    @Test
    public void get1(){
        Integer index = 1;
        String text = Meiju.getName(index).getText();
        System.out.println(text);
    }

    @Test
    public void get2(){
        Optional objectTest = Optional.of(null);
    }





}
