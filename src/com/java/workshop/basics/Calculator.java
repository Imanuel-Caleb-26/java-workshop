package com.java.workshop.basics;
import java.util.Calendar;
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
        try{
             if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }catch (ArithmeticException e) {

            System.out.println(e.getMessage());
            return 0;
            
        }
        return a / b;
    }

      
       public static void main(String[] args) {
                    
          Calculator cal = new Calculator();
         System.out.println("Addition: " + cal.add(30,20));
         System.out.println("Subraction: " + cal.subtract(10,4));
         System.out.println("Multiplication: " + cal.multiply(28,4));
         System.out.println("Divide: "+ cal.divide(6,0));
       }


  }
