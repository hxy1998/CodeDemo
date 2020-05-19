package com.example.demo.Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Huang xing yuan
 * @date 2020-04-29-14:06
 */
public class ListUtil {

    /**
     * 根据list的元素进行去重操作
     * @param list
     * @param <T>
     * @return
     */
    public static <T> List<T> distinct(List<T> list){
        List<T> temp = new ArrayList<>();
        if (list == null){
            return temp;
        }
        list.stream().filter(e -> !temp.contains(e)).forEach(temp::add);
        return temp;
    }

    /**
     * 根据传入的list的属性进行去重操作
     * @param list
     * @param function
     * @param <T>
     * @return
     */
    public static <T, R> List<T> distinct(List<T> list, Function<T, R> function){
        List<T> temp = new ArrayList<>();
        List<R> filterList = new ArrayList<>();
        if (list == null){
            return temp;
        }
        list.stream().filter(e -> {
            R apply = function.apply(e);
            if (!filterList.contains(apply)){
                filterList.add(apply);
                return true;
            }else {
                return false;
            }
        }).forEach(temp::add);
        return temp;
    }

    /**
     * 根据对象的String类型的属性进行字符拼接
     * @param collection
     * @param function
     * @param delimiter
     * @param <T>
     * @return
     */
    public static <T> String joining(Collection<T> collection, Function<T, String> function, CharSequence delimiter){
        if (collection == null || collection.size() == 0){
            return "";
        }
        return collection.stream().map(function).collect(Collectors.joining(delimiter));
    }

    /**
     * 根据String类型的集合进行字符串拼接
     * @param collection
     * @param delimiter
     * @return
     */
    public static String joining(Collection<String> collection, CharSequence delimiter){
        if (collection == null || collection.size() == 0){
            return "";
        }
        return collection.stream().collect(Collectors.joining(delimiter));
    }

    /***
     * 根据传入的对象集合获取指定的属性集合
     * @param collection
     * @param function
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T, R> List<R> getProps(Collection<T> collection, Function<T, R> function){
        List<R> temp = new ArrayList<>();
        if (collection == null || collection.size() == 0){
            return temp;
        }
        return collection.stream().map(function).collect(Collectors.toList());
    }

    public static <T, R> Map<R, T> convertListToMap(Collection<T> collection, Function<T, R> function){
        Map<R, T> map = new HashMap<>();
        if (collection == null || collection.size() == 0){
            return map;
        }
        return collection.stream().collect(Collectors.toMap(function, Function.identity(), (newValue, oldValue) -> newValue));
    }

    public static <T, R> Map<R, List<T>> convertListToList(Function<T,R> function, Collection<T> collection){
        return collection.stream().collect(Collectors.groupingBy(function, Collectors.toList()));
    }
}
