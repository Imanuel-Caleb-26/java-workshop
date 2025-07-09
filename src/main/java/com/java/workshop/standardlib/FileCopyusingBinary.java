package com.java.workshop.standardlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyusingBinary {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("src/com/java/workshop/Standardlib/scecn.jpg");
             FileOutputStream outputStream = new FileOutputStream("src/com/java/workshop/Standardlib/question.jpg")) {
            
            byte[] chunk = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(chunk)) != -1) {
                outputStream.write(chunk, 0, bytesRead);
            } 
        } catch (Exception e) {
            System.out.println("Error during file copying:");
        }
    }
}
