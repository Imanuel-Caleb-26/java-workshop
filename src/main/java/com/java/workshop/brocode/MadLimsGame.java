package com.java.workshop.brocode;
import java.util.Scanner;

public class MadLimsGame {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);

        String adj1;
        String noun1;
        String adj2;
        String verb;
        String adj3;

        System.out.print("Enter the adjective: ");
        adj1 = scan.nextLine();
        System.out.print("Enter the noun: ");
        noun1 = scan.nextLine();
        System.out.print("Enter the adjective: ");
        adj2 = scan.nextLine();
        System.out.print("Enter the verb: ");
        verb = scan.nextLine();
        System.out.print("Enter the adjective: ");
        adj3 = scan.nextLine();
        

        System.out.println("This day is very " + adj1);
        System.out.println("Because I saw " + noun1);
        System.out.println("so " + verb + " and this day must be " + adj2);
        System.out.println("It was " + adj3);

        scan.close();

         
        
    }
}
