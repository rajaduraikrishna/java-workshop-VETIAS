package com.vetias.java.workshop.basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateFormatExample {

    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}
