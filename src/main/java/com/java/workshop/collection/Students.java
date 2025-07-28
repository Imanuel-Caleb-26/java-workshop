package com.java.workshop.collection;

public class Students {

        private int id;
        private String name;
    
        public void Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
    
        // Getters
        public int getId() {
            return id;
        }
    
        public String getName() {
            return name;
        }
    
        @Override
        public String toString() {
            return "Student { ID: " + id + ", Name: " + name + " }";
        }
    
}
