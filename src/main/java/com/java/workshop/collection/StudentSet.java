package com.java.workshop.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StudentSet {

    public static void main (String[] args) {
        Set<Integer> rollno = new HashSet<>();  
        rollno.add(1001);
        rollno.add(1002);
        rollno.add(1003);       
        rollno.add(1004);
        rollno.add(1005);
        rollno.add(1006);
        rollno.add(1007);


        System.out.println(rollno);
        for(Integer roll : rollno){
            System.out.println(roll);
        }
    }
}
