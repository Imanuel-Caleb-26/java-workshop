package com.java.workshop.basics;

public class Printf {
        public static void main(String[] args) {
            String name = "Imanuel";
            char fletter = 'I';
            int age = 19;
            double height = 180.79;
            boolean IsStudent = true ;

            System.out.printf("Your Name is %s \n", name);
            System.out.printf("Your First letter is %c \n", fletter);
            System.out.printf("Your age is %d \n", age);
            System.out.printf("Your Height is %f \n",height);
            System.out.printf("Is he Student %b \n",IsStudent);

        }
}
