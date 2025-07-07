package com.java.workshop.basics;

public class Upper {
     public static void main(String[] args){

        String firstName  = "imanuel";
        String lastName = "caleb";
        String fullName = firstName .concat(lastName);

        String upperCase = fullName.toUpperCase();
        System.out.println((" The upper case of  my name is :" + upperCase));

        System.out.println(firstName == lastName);

        String sentance = "this is a code to change the case to upper and check the boolan value";
        String word[] = sentance.split ("");

        System.out.println("The length of the sentance is: " + word.length);
    }
}
