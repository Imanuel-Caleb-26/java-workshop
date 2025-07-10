package com.java.workshop.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Imanuel");
        names.add("Shahul");
        names.add("Reshma");
        names.add("Zammer");    
        names.add("Santhosh");
        names.add("Logesh");
        names.add("Nowfiya");
        
        System.out.println(names);
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
