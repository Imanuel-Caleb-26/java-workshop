package com.java.workshop.stream;

import java.util.Arrays;
import java.util.stream.IntStream;


public class ArrayStream {
    public static void main(String[] args) {
         int[] marks={34,88,67,97,56};
         long numberofSubjectsPassed = Arrays.stream(marks)
         .filter(mark -> mark >= 35).count();
         System.out.println(numberofSubjectsPassed);

         IntStream marksStream = Arrays.stream(marks);
         numberofSubjectsPassed = marksStream
         .filter(mark -> mark > 35).count();
   }
}

