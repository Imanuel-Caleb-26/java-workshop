package com.java.workshop.lambda;
import java.util.Scanner;
public class Prime {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num <= 1)
            isPrime = false;
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(num + (isPrime ? " is Prime" : " is Not Prime"));
    }
}
