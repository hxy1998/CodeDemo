package com.example.demo.java8新时间类.LocalDate;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {

    @Test
    public void test1(){
        LocalDate data = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        String format = dateTime.format(DateTimeFormatter.ofPattern("yyy-MM-yy HH:mm:ss"));
        System.out.println(format);
    }



}
