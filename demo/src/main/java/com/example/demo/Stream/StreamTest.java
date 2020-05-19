package com.example.demo.Stream;

import org.junit.Test;
import sun.dc.pr.PRError;

import javax.annotation.PreDestroy;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.PipedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: hxy
 * @create: 2020/03/18/15:07
 */
public class StreamTest {

    @Test
    public void get(){
        List<String []> lists = new ArrayList<>();
        String array1[] = {"第一组的鸡蛋","第一组的鸡蛋","第一组的鸡蛋","第一组的鸡蛋","第一组的鸡蛋"};
        String array2[] = {"第二组的鸡蛋","第二组的鸡蛋","第二组的鸡蛋","第二组的鸡蛋","第二组的鸡蛋"};
        lists.add(array1);
        lists.add(array2);

        //map
        lists.stream().map(e -> Arrays.stream(e).map(s -> s.replace("鸡", "煎"))).forEach(x -> System.out.println(Arrays.toString(x.toArray())));

        lists.stream().flatMap(e -> Arrays.stream(e).map(s -> s.replace("鸡", "煎"))).forEach(x -> System.out.println(x));

        int count = Stream.of(1, 2, 3)
                .reduce(1, (x, y) -> x + y);
        System.out.println(count);

    }


    @Test
    public void get1(){
        Runnable runnable = () -> System.out.println("Hello World");
        runnable.run();
//        StudentTest studentTest = e -> System.out.println("稀疏");
//        studentTest.run("你好");
        Predicate<Integer> predicate = e -> e + 3 > 5;
        System.out.println(predicate.test(2));
    }

}
