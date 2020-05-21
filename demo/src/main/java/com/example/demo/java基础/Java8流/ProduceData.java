package com.example.demo.java基础.Java8流;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Huang xing yuan
 * @date 2020-05-21-11:26
 */
public class ProduceData {

    static List<Data> list = new ArrayList<>();

    static {
        Data Data1 = new Data("张三",33);
        Data Data2 = new Data("李四",15);
        Data Data3 = new Data("王五",22);
        Data Data4 = new Data("六六",52);
        Data Data5 = new Data("张三",15);
        list.add(Data1);
        list.add(Data2);
        list.add(Data3);
        list.add(Data4);
        list.add(Data5);
    }

}
