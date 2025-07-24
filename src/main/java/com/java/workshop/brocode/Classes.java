package com.java.workshop.brocode;

class Car {
    String model;
    int year;

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class Classes {

        public static void main(String[] args) {
            Car myCar = new Car();
            myCar.model = "Toyota";
            myCar.year = 2022;
            myCar.display();
        }
    }
    
