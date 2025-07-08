package com.java.workshop.basics;
import java.util.Scanner;
import java.time.LocalDate;

public class AgeCalculator {

    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter your of birth year: ");
         int dob = scan.nextInt();
         int currentYear = LocalDate.now().getYear();
         int age = currentYear - dob;
         System.out.println("The age is: " + age );

        

    }
}
