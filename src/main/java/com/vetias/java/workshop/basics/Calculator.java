package com.vetias.java.workshop.basics;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }   
    public int multiply(int a, int b) {
        return a * b;
    }   
    public int divide(int a, int b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0; // or handle it in a way that suits your application
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Division: " + calculator.divide(6, 0));
        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(10, 4));
        System.out.println("Addition Again :" + calculator.add-5,25);
    }
}
