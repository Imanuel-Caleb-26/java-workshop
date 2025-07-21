package com.java.workshop.collection;
import java.util.ArrayList;
import java.util.List;
public class Lists {
   
        public static void main(String[] args) {
            // Create a list of Strings
            List<String> fruits = new ArrayList<>();
    
            // Add elements to the list
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Mango");
            fruits.add("Orange");
    
            // Print the list
            System.out.println("Fruits List: " + fruits);
    
            // Access elements
            System.out.println("First fruit: " + fruits.get(0));
    
            // Remove an element
            fruits.remove("Banana");
            System.out.println("After removing Banana: " + fruits);
    
            // Check if a fruit is in the list
            if (fruits.contains("Mango")) {
                System.out.println("Mango is in the list.");
            }
    
            // Iterate through the list
            System.out.println("Iterating through the list:");
            for (String fruit : fruits) {
                System.out.println(fruit);
            }
        }
    
}
