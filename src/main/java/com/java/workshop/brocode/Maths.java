package com.java.workshop.brocode;

public class Maths {
        public static void main(String[] args) {
            Double result;

            System.out.println(Math.PI);
            System.out.println(Math.E);

            result = Math.pow(2, 5); //power 
            result = (double) Math.abs(-5); //absolute value
            result = Math.sqrt(9); //square root
            result = (double) Math.round(3.14); //round of 
            result = Math.ceil(3.14); //celling
            result = Math.floor(3.66); //floor
            result = (double) Math.max(10, 020); // max num
            result = (double) Math.min(10,20); //min num

            System.out.println(result);
        }
}
