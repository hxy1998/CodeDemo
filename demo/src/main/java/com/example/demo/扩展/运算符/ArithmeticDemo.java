package com.example.demo.扩展.运算符;

/**
 * @author Huang xing yuan
 * @date 2020-05-22-11:07
 */
public class ArithmeticDemo {

    public static void main(String[] args) {

        /**
         *  ^ 运算符
         *  1. 6 二进制：00000110  7 二进制：00000111
         *  2. 比较 00000110 和 00000111 如果相同取0，不相同取1 得：00000001
         *  3. 将00000001转10进制：
         *  1 * 2的0次方
         *  0 * 2的1次方    =   1
         *  0 * 2的2次方
         */
        System.out.println(6 ^ 7);

        /**
         *  << 左移运算符
         *  1. 6 二进制：00000110 将二进制往左移动2位
         *  2. 得：00011000
         *  3. 将00011000转为10进制得：24
         */
        System.out.println(6 << 2);

        /**
         *  >> 右移运算符
         *  1. 6 二进制：00000110 将二进制往右移动2位
         *  2. 得：00000001 （注：正数补0，负数补1）
         *  3. 将00000001转为10进制得：1
         */
        System.out.println(6 >> 2);

        /**
         *  >> 无符号右移运算符
         *  1. 6 二进制：00000110 将二进制往右移动2位
         *  2. 得：00000001 （注：不管是正数还是负数都补0）
         *  3. 将00000001转为10进制得：1
         */
        System.out.println(6 >>> 2);
    }

}
