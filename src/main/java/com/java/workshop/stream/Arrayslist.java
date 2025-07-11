package com.java.workshop.stream;

import java.util.List;
import java.util.ArrayList;

public class Arrayslist {

    public static void main(String[] args){
        
        List<Integer> marks = new ArrayList<>(List.of(20, 30, 40, 50, 60, 70));

        long numberOfSubjectsPassed = marks.stream()
            .filter(mark -> mark >= 35)
            .count();
        System.out.println(numberOfSubjectsPassed);
    }
  
}
