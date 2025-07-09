package com.java.workshop.temp.bin;

public class Location {
   
        private String name;
        private Double latitude;
        private Double longitude;
        private String description;
        private String country;
        private String city;
        private String address;
        private double postalcode;

        public String getName() {
            return name;
        }
        public Double getLatitude() {
            return latitude;
        }
        public Double getLongitude() {
            return longitude;
        }
        public String getDescription() {
            return description;
        }
        public String getCountry() {
            return country;
        }

        public String getCity() {
            return city;
        }
        public String getAddress() {
            return address;
        }
        public double getPostalcode() {
            return postalcode;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }
        public void setLongitude(Double longitude) {
            this.longitude = longitude;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public void setCountry(String country) {
            this.country = country;
        }
        public void setCity(String city) {
            this.city = city;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public void setPostalcode(double postalcode) {
            this.postalcode = postalcode;
        }

        @Override
        public String toString() {
            return "Location { name:" +name +
                   ", latitude:" + latitude +
                   ", longitude:" + longitude +
                   ", description:" + description +
                   ", country:" + country +
                   ", city:" + city +
                   ", address:" + address +
                   ", postalcode:" + postalcode +
                   " }"; 
}
        
}