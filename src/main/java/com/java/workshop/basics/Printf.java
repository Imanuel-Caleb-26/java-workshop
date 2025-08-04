package com.java.workshop.basics;

public class Printf {
        public static void main(String[] args) {
            //formart specifier
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

            //presition
            double price1 = 90.1234;
            double price2 = 199.8283;
            double price3 = 23.3448;

            System.out.printf("%f\n",price1);
            System.out.printf("%.3f\n",price2);
            System.out.printf("%.2f\n",price3);


        }
}
