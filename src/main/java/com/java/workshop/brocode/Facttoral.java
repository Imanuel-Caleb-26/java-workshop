package com.java.workshop.brocode;

public class Facttoral {

        public static int factorial(int n) {
            if (n == 0)
                return 1;
            else
                return n * factorial(n - 1);
        }
    
        public static void main(String[] args) {
            int number = 5;
            System.out.println("To Print the factorial:");
            System.out.println("Factorial of " + number + " is: " + factorial(number));
        }
    

}
