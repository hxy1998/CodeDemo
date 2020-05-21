package com.example.demo.java基础.Java8流;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 四大函数式接口
 * @author Huang xing yuan
 * @date 2020-05-21-10:43
 */
public class FunctionInterfaceDemo {

    public static void main(String[] args) {

        //消费型接口:Consumer<T> 传入一个参数且不返回
        Consumer consumer = e -> System.out.println("消费型接口：传入参数不做返回");
        consumer.accept(new Object());

        //供给型接口：Supplier<T> 不传参数且返回一种类型的数据
        Supplier<String> supplier = () -> "供给型接口：不传参数返回一种数据";
        System.out.println(supplier.get());

        //函数型接口：Function<T,R> 传入一种类型数据返回另一种类型数据
        Function<Integer,String> function = e -> "函数型接口：传入一种类型数据,返回另一种类型数据";
        System.out.println(function.apply(1));

        //断言型接口：Predicate<T> 传入一种类型数据返回布尔类型数据
        Predicate<Integer> predicate = e -> e + 3 > 5;
        System.out.println("断言型接口：传入一种类型数据返回布尔类型数据" + predicate.test(3));

    }

}
