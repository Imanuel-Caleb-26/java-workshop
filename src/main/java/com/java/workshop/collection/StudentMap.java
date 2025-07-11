package com.java.workshop.collection;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1001, "Imanuel");
        students.put(1002, "Shahul");
        students.put(1003, "Zammer");
        students.put(1004, "Santhosh");
        
        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());
    }
}
