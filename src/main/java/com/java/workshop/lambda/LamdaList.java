package com.java.workshop.lambda;
import java.util.ArrayList;
import java.util.List;

public class LamdaList {
   
        public static void main(String[] args) {
            // Create a list of Strings
            List<String> fruits = new ArrayList<>();
    
            // Add elements
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Mango");
            fruits.add("Orange");
    
            // Print the list using lambda
            System.out.println("Fruits List:");
            fruits.forEach(fruit -> System.out.println(fruit));
    
            // Filter and print only fruits that start with 'A'
            System.out.println("\nFruits starting with 'A':");
            fruits.stream()
                  .filter(fruit -> fruit.startsWith("A"))
                  .forEach(System.out::println);
    
            // Convert all fruits to uppercase using lambda and print
            System.out.println("\nUppercased Fruits:");
            fruits.stream()
                  .map(fruit -> fruit.toUpperCase())
                  .forEach(System.out::println);
    
            // Remove all fruits that have length > 5 using lambda
            fruits.removeIf(fruit -> fruit.length() > 5);
            System.out.println("\nAfter removing fruits with name length > 5:");
            fruits.forEach(System.out::println);
        }
    
}
