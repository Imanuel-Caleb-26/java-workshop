package com.java.workshop.stream;
import java.util.ArrayList;
import java.util.List;

public class NameStartWithCount {
    public static void main(String[] args) {
        List <String> names = new ArrayList<>();
        names.add("Imanuel");
        names.add("Shahul");    
        names.add("Reshma");
        names.add("Zammer");
        names.add("Santhosh");
        names.add("Logesh");
        names.add("Nowfiya");

        names.stream()
            .filter(name -> name.startsWith("S")|| name.startsWith("s"))
            .map(name -> name.toUpperCase())
            .forEach(System.out::println);
    }

}
