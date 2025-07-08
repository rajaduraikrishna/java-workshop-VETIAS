package com.vetias.java.workshop.basics;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
       Scanner inputScanner = new Scanner(System.in);
       System.out.println("Enter you Date of bith (YYYY-MM-DD): ");
       String dateOfBirth = inputScanner.nextLine();
       LocalDate birthDate = LocalDate.parse(dateOfBirth);
       int yearOfBirth = birthDate.getYear()
       int currentYear = LocalDate.now().getYear();
    }
}
