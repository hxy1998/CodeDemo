package com.example.demo.Stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Huang xing yuan
 * @date 2020-04-29-14:18
 */
public class ListUtilTest {

    private static List<CommObject> list;

    static {
        list = new ArrayList<>();
        CommObject object1 = new CommObject();
        object1.setName("张三");
        object1.setAge(18);
        CommObject object2 = new CommObject();
        object2.setName("李四");
        object2.setAge(20);
        CommObject object3 = new CommObject();
        object3.setName("王五");
        object3.setAge(30);
        CommObject object4 = new CommObject();
        object4.setName("王妃");
        object4.setAge(30);
        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(object4);
    }

    @Test
    public void get(){
        //根据对象的某个属性进行去重
        List<CommObject> filterList = ListUtil.distinct(list, CommObject::getAge);
        System.out.println(filterList);
        //根据对象的某个String类型的属性进行拼接
        String joining = ListUtil.joining(list, CommObject::getName, "-");
        System.out.println(joining);
        List<String> props = ListUtil.getProps(list, CommObject::getName);
        System.out.println(props);
        Map<Integer, List<CommObject>> collect = list.stream().collect(Collectors.groupingBy(CommObject::getAge, Collectors.toList()));
        System.out.println(collect);
        Map<Integer, List<CommObject>> integerListMap = ListUtil.convertListToList(CommObject::getAge, list);
        System.out.println(integerListMap);
    }






}
