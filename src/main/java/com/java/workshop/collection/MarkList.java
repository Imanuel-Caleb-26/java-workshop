package com.java.workshop.collection;

import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class MarkList {

    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>(List.of(1234,5433,7899,4433,789,9954,76788,433));
        
        marks.sort(Comparator.naturalOrder());
        System.out.println("Ascending order: " + marks);
        
        marks.sort(Comparator.reverseOrder());
        System.out.println("Descending order: " + marks);

        System.out.println("Maximum mark: " + Collections.max(marks));
        System.out.println("Minimum mark: " + Collections.min(marks));
    }
}
