package com.java.workshop.brocode;
import java.util.Scanner;

public class ShopingCart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String item;
        Double rupee;
        int count;
        Double total;

        System.out.print("What you like to buy: ");
        item = scan.nextLine();
        System.out.print("Rate of the " + item +" ");
        rupee = scan.nextDouble();
        System.out.print("How many " + item + " ");
        count = scan.nextInt();

        total = rupee * count;

        System.out.println("You Brought " + count + " " + item);
        System.out.println("And the total is: " + total);
       
        scan.close();

    }

}
