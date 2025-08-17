package com.java.workshop.brocode;
import java.util.Random;

public class Randomes {

    public static void main(String[] args) {
        Random random = new Random();
        
        int num;
        num = random.nextInt(1,6);

        double num1;
        num1 = random.nextDouble(1,7);

        boolean num2;
        num2 = random.nextBoolean();

        System.out.println("The interger Random is: " + num );
        System.out.println("The double Random is: " + num1 );
        System.out.println("The Boolen Random is: " + num2 );
        System.out.println("These are the output.");

    }

}