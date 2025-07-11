package com.java.workshop.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentListMerge {
    public static void main(String[] args) {
        List<Integer> csRollno = Arrays.asList(1001, 1002, 1003, 1004);
        List<Integer> itRollno = Arrays.asList(2001, 2002, 2003, 2004);
        List<Integer> aidRollno = Arrays.asList(3001, 3002, 3003, 3004);

        List<Integer> allRollno = Stream.concat(
                                    Stream.concat(csRollno.stream(), itRollno.stream()), 
                                    aidRollno.stream())
                                .collect(Collectors.toList());

        System.out.println(allRollno);
    }
}
