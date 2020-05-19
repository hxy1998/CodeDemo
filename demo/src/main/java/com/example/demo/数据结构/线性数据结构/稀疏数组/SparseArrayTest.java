package com.example.demo.数据结构.线性数据结构.稀疏数组;

import org.junit.Test;

public class SparseArrayTest {

    /**
     * 五子棋
     * 二维数组转稀疏数组
     * 应用场景：简化二维数组的大小
     * 特点：当二维数组出现较多的相同值得时候
     */
    @Test
    public void get(){
        //生成二维数组
        int twoArray[][] = new int[11][11];
        //将棋子进行赋值操作 0:空 1:黑棋 2:白棋
        twoArray[0][2] = 1;
        twoArray[1][1] = 1;
        twoArray[1][3] = 2;
        twoArray[1][2] = 2;
        twoArray[1][4] = 2;

        //获取棋盘上目前下了的棋子
        int sum = 0;
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                if (twoArray[i][j] != 0){
                    sum++;
                }
                //查看棋盘数据
                System.out.print(twoArray[i][j] + " ");
            }
            System.out.println();
        }

        /**
         *    打印结果
         *    0 0 1 0 0 0 0 0 0 0 0
         *    0 1 2 2 0 0 0 0 0 0 0
         *    0 0 0 0 0 0 0 0 0 0 0
         *    0 0 0 0 0 0 0 0 0 0 0
         *    0 0 0 0 0 0 0 0 0 0 0
         *    0 0 0 0 0 0 0 0 0 0 0
         *    0 0 0 0 0 0 0 0 0 0 0
         *    0 0 0 0 0 0 0 0 0 0 0
         *    0 0 0 0 0 0 0 0 0 0 0
         *    0 0 0 0 0 0 0 0 0 0 0
         *    0 0 0 0 0 0 0 0 0 0 0
         */

        //创建稀疏数组
        int sparseArray[][] = new int[sum +1][3];
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sum;

        //转为稀疏数组
        int count = 0;
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                if (twoArray[i][j] != 0){
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = twoArray[i][j];
                }
            }
        }

        //查看稀疏数组
        for (int i = 0; i < sparseArray.length; i++) {
            for (int j = 0; j < sparseArray[i].length; j++) {
                if (twoArray[i][j] != 0) {
                    sum++;
                }
                //查看棋盘数据
                System.out.print(sparseArray[i][j] + " ");
            }
            System.out.println();
        }

        /**
         *
         *     11 11 4
         *      0  2 1
         *      1  1 1
         *      1  2 2
         *      1  3 2
         *
         */

        twoArray.clone();
        //还原二维数组
        for (int i = 1; i < sparseArray[0][2] + 1; i++) {
            twoArray[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }

        //打印还原后的二维数组
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                //查看棋盘数据
                System.out.print(twoArray[i][j] + " ");
            }
            System.out.println();
        }


    }

    @Test
    public void get1(){
        //创建稀疏数组
        int sparseArray[][] = new int[3][3];
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = 2;

        sparseArray[1][0] = 0;
        sparseArray[1][1] = 3;
        sparseArray[1][2] = 1;

        sparseArray[2][0] = 1;
        sparseArray[2][1] = 2;
        sparseArray[2][2] = 2;

        //创建二维数组
        int twoArray[][] = new int[sparseArray[0][0]][sparseArray[0][1]];

        //还原二维数组
        for (int i = 1; i < sparseArray[0][2] + 1; i++) {
            twoArray[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }

        //打印还原后的二维数组
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                //查看棋盘数据
                System.out.print(twoArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
