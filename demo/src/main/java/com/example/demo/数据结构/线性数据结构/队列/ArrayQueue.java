package com.example.demo.数据结构.线性数据结构.队列;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayQueue {

    //首
    private Integer first = -1;

    //尾
    private Integer tail = -1;

    //默认队列最大容量
    private Integer maxSize = 10;

    private Object array[];

    public ArrayQueue(Integer index) {
        if (index > 0){
           this.array  = new Object[index];
        }else {
            this.array  = new Object[0];
            System.out.println("请输入大于0 或等于0 的初始变量");
        }
    }

    //添加到队列
    public Boolean addQueue(Object obj){
        if (this.array.length == 0){
            this.array  = new Object[maxSize];
        }
        if (this.tail < this.array.length - 1){
            tail++;
            this.array[this.tail] = obj;
            return true;
        }else {
            System.out.println("队列已满");
            return false;
        }
    }

    public Boolean deleteQueue(Object obj){





        return null;
    }




    @Override
    public String toString() {
        return "ArrayQueue{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
