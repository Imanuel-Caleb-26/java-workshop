package com.java.workshop.basics;
import java.time.LocalTime;

public class Localtime {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime registrationendTime = LocalTime.of(18, 48, 00);
        int hrs = registrationendTime.getHour() - currentTime.getHour();
        int min = registrationendTime.getMinute() - currentTime.getMinute();
        int sec = registrationendTime.getSecond() - currentTime.getSecond();
        System.out.println("You have :" + hrs + " Hours " + min + "Minutes " + sec + " Second left");
    }


}
