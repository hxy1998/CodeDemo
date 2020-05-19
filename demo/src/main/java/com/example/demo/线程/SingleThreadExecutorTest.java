package com.example.demo.线程;

import com.sun.corba.se.impl.orbutil.concurrent.Mutex;

import java.util.concurrent.*;

/**
 * @Author: hxy
 * @create: 2020/03/06/14:43
 */
public class SingleThreadExecutorTest {

    public static void main(String[] args) {
        Callable myCallable = new Callable() {
            @Override
            public String call() throws Exception {
                System.out.println("方法执行了");
                return "call方法返回值";
            }
        };
        ExecutorService executor = Executors.newCachedThreadPool();
        Future submit = executor.submit(myCallable);
        try {
            Object o = submit.get();
            System.out.println(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
