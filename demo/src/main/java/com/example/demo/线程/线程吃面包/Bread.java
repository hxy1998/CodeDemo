package com.example.demo.线程.线程吃面包;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: hxy
 * @create: 2020/03/19/10:05
 */
@Data
@AllArgsConstructor
public class Bread {

    private Integer size;

    public void jiaSize() {
        size++;
        System.out.println("开始生产："+ size + "个");
    }

    public void jianSize() {
        size--;
        System.out.println("开始消费："+ size + "个");
    }


}
