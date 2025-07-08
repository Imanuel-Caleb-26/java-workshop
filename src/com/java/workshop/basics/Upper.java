package com.java.workshop.basics;

public class Upper {
     public static void main(String[] args){

        String firstName  = "imanuel";
        String lastName = "caleb";
        String fullName = firstName .concat(lastName);

        String upperCase = fullName.toUpperCase();
        System.out.println((" The upper case of  my name is :" + upperCase));

        System.out.println(firstName == lastName);


        String sentance = "this is a code to change the case. It is a good code to learn.";

        String word[] = sentance.split (" ");
        System.out.println("The length of the word is: " + word.length);

        String sentances[] = sentance.split("\\."); //*  [\\] use this to split by space then only it consiter                                                             
        System.out.println("The length of the sentance is: " + sentances.length);

        String chatacter[] = sentance.split("");
        System.out.println("The length of the character is: " + chatacter.length);
    


      
    }
}
