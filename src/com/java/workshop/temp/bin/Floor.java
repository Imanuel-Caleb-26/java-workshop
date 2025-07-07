package com.java.workshop.temp.bin;

public class Floor {
    
       private String name;
       private double number;

        //getters
        public String getName() {
            return name;
        }
        public double getNumber() {
            return number;
        }
        //setters
        public void setName(String name) {
            this.name = name;
        }
        public void setNumber(double number) {
            this.number = number;
        }
             
        @Override
        public String toString() {
            return "Floor{" +
                    "name='" + name + '\'' +
                    ", number=" + number +
                    '}';
        }
    }

