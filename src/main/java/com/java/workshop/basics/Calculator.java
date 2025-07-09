package com.java.workshop.basics;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;       
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0; 
        }
        return a / b;
    }

    public static void main(String[] args) {

        System.out.println("Addition: " + Calculator.add(30, 20));
        System.out.println("Subtraction: " + Calculator.subtract(10, 4));
        System.out.println("Multiplication: " + Calculator.multiply(28, 4));
        System.out.println("Division: " + Calculator.divide(6, 0));  
    }
}
