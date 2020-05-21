package com.example.demo.java基础.java8新时间类.LocalDate;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {

    @Test
    public void test1(){
        LocalDate data = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        String format = dateTime.format(DateTimeFormatter.ofPattern("yyy-MM-yy HH:mm:ss"));
        System.out.println(format);
    }



}
