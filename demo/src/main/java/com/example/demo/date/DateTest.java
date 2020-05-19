package com.example.demo.date;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: hxy
 * @create: 2020/03/20/15:18
 */
public class DateTest {

    @Test
    public void get(){
        Date date1 = new Date();
        Date date2 = new Date(date1.getTime() + 24 * 60 * 60);
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String format1 = dateFormat.format(date1);
        String format2 = dateFormat.format(date2);
        System.out.println(format1);
        System.out.println(format2);
    }

}
