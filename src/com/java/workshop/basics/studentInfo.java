package com.java.workshop.basics;

public class studentInfo {
    public static void main(String[] args) {
        String[][] students = {
            {"101", "Imanuel"},
            {"102", "Shahul"},
            {"103", "Zammer"},
            {"104", "santhosh"}
        };

        System.out.println("Roll No\tName");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i][0] + "\t" + students[i][1]);
        }
    }
}
