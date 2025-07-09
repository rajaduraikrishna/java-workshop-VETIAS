package com.vetias.java.workshop.basics;

import java.time.LocalDate;

public class DateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);
        LocalDate yesDate = today.minusDays(1);
        System.out.println("Yesterday's date: " + yesDate);

        LocalDate examDate = LocalDate.of(2025, 11, 15);

        // examDate
        // System.out.println("Exam date: " + examDate);

        System.out.println("Exam date after one month: " + examDate.plusMonths(1));
    }
}
