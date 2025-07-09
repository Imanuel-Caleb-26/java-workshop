package com.java.workshop.standardlib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharacterbasedReader {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("src/com/java/workshop/Standardlib/sample.txt")))
        {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Reading file is error");
            e.printStackTrace();
        }
   }
}