package com.example.demo.乐观锁_CAS;

import lombok.Data;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: hxy
 * @create: 2020/03/09/15:26
 */
@Data
public class AtomicIntegerTest implements Runnable{

    //使用原子性的Integer变量
    private static AtomicInteger is = new AtomicInteger(5);

    private int count = 1;

    @Override
    public void run() {
        count++;
        System.out.println(count);
        if (is.compareAndSet(count,10)){
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            is.set(10);
            System.out.println("修改成功!");
        }else {
            System.out.println("值被改变开始重试自旋:"+Thread.currentThread().getName()+"变量is为："+is.get());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            run();
        }
    }

    public static void main(String[] args) {
        AtomicIntegerTest ast = new AtomicIntegerTest();
        Thread thread1 = new Thread(ast);
        Thread thread = new Thread(ast);
        thread1.start();
        thread.start();
    }
}
