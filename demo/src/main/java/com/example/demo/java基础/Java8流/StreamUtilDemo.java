package com.example.demo.java基础.Java8流;

import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 封装Steam的一些值转换方法
 * @author Huang xing yuan
 * @date 2020-05-21-11:08
 */
public class StreamUtilDemo {

    /**
     * 取出传入对象的指定属性
     * @param list
     * @param function
     * @param <T>
     * @param <R>
     * @return
     */
    public static<T, R> List<R> getListByProperty(Collection<T> list, Function<T, R> function){
        if (list == null || list.isEmpty()){
            return new ArrayList<>();
        }
        return list.stream().map(function).collect(Collectors.toList());
    }

    /**
     * 按传入的指定评价字符串将集合里面的数据进行拼接
     * @param list
     * @param delimiter
     * @return
     */
    public static String getStringByProperty(Collection<String> list, CharSequence delimiter){
        if (list == null || list.isEmpty()){
            return "";
        }
        return list.stream().collect(Collectors.joining(delimiter));
    }

    /**
     * 按传入的字符串进行指定属性拼接
     * @param list
     * @param function
     * @param delimiter
     * @param <T>
     * @return
     */
    public static <T> String getStringByProperty(Collection<T> list, Function<T, String> function, CharSequence delimiter){
        if (list == null || list.isEmpty()){
            return "";
        }
        return list.stream().map(function).collect(Collectors.joining(delimiter));
    }

    /**
     * 将传入的list的属性指定为key value为本身
     * @param list
     * @param function
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T, R> Map<R, T> getMapByProperty(Collection<T> list, Function<T, R> function){
        if (list == null || list.isEmpty()){
            return new HashMap<>(16);
        }
        return list.stream().collect(Collectors.toMap(function, Function.identity(), (newValue,Value) -> newValue));
    }

    /**
     * 将传入的list的属性指定为key和value
     * @param list
     * @param key
     * @param value
     * @param <T>
     * @param <K>
     * @param <V>
     * @return
     */
    public static <T, K, V> Map<K, V> getMapByProperty(Collection<T> list, Function<T, K> key, Function<T, V> value){
        if (list == null || list.isEmpty()){
            return new HashMap<>(16);
        }
        return list.stream().collect(Collectors.toMap(key, value, (newValue,Value) -> newValue));
    }

    /**
     * 将传入集合中指定的属性进行相同数量统计
     * @param list
     * @param function
     * @param <T>
     * @param <R>
     * @return
     */
    public static<T, R> Map<R, Long> getMapByPropertyCount(Collection<T> list, Function<T, R> function){
        if (list == null || list.isEmpty()){
            return new HashMap<>(16);
        }
        return list.stream().collect(Collectors.groupingBy(function, Collectors.counting()));
    }

    /**
     * 将指定的属性为key，value为相同key的集合
     * @param list
     * @param function
     * @param <T>
     * @param <R>
     * @return
     */
    public static<T, R> Map<R, List<T>> getMapListByProperty(Collection<T> list, Function<T, R> function){
        if (list == null || list.isEmpty()){
            return new HashMap<>(16);
        }
        return list.stream().collect(Collectors.groupingBy(function, Collectors.toList()));
    }

    /**
     * 将指定的属性为key，value为相同key的指定value集合
     * @param list
     * @param key
     * @param value
     * @param <T>
     * @param <K>
     * @param <V>
     * @return
     */
    public static<T, K, V> Map<K, List<V>> getMapListByProperty(Collection<T> list, Function<T, K> key, Function<T, V> value){
        if (list == null || list.isEmpty()){
            return new HashMap<>(16);
        }
        return list.stream().collect(Collectors.groupingBy(key,Collectors.mapping(value, Collectors.toList())));
    }

    @Test
    public void methodTest(){
        List<Data> list =  ProduceData.list;

        //取出传入对象的指定属性
        System.out.println(getListByProperty(list, Data::getName));

        //按传入的指定评价字符串将集合里面的数据进行拼接
        System.out.println(getStringByProperty(getListByProperty(list, Data::getName), "+"));
        //按传入的字符串进行指定属性拼接
        System.out.println(getStringByProperty(list, Data::getName, "+"));

        //将传入的list的属性指定为key value为本身
        System.out.println(getMapByProperty(list, Data::getName));
        //将传入的list的属性指定为key和value
        System.out.println(getMapByProperty(list, Data::getName, Data::getAge));
        //将传入集合中指定的属性进行相同数量统计
        System.out.println(getMapByPropertyCount(list, Data::getName));
        //将指定的属性为key，value为相同key的集合
        System.out.println(getMapListByProperty(list, Data::getName));
        //将指定的属性为key，value为相同key的指定value集合
        System.out.println(getMapListByProperty(list, Data::getName, Data::getAge));
    }

}
