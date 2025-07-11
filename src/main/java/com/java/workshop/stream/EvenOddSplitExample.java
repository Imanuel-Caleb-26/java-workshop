package com.java.workshop.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class EvenOddSplitExample {
     public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean, List<Integer>> groupMap = numbers.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));
                
                System.out.println("Even Numbers: " + groupMap.get(true));
                System.out.println("Odd Numbers: " + groupMap.get(false));
             }

}
