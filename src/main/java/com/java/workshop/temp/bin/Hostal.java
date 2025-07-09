package com.java.workshop.temp.bin;

public class Hostal extends Building {
     
        private boolean isMessAvailable;
        private int numberOfRooms;

        public boolean isMessAvailable() {
            return isMessAvailable;
        }
        public int getNumberOfRooms() {
            return numberOfRooms;
        }
        public void setMessAvailable(boolean isMessAvailable) {
            this.isMessAvailable = isMessAvailable;
        }


        public void setNumberOfRooms(int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
        }
        @Override
        public void printDetails(){
            super.printDetails();
            System.out.println("Mess Available: " + isMessAvailable);   
            System.out.println("Number of Rooms: " + numberOfRooms);

        }
    }