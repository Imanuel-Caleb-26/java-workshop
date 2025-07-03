package com.java.workshop.temp.bin;
import java.time.LocalDateTime;
public class Bulding {
        private String name;
        private String area;
        private Double floor;
        private LocalDateTime openDatetime;
        private  LocalDateTime cloesDatetime;

        
        public String getName() {
            return name;
        }
        public String getArea() {
            return area;
        }
        public Double getFloor() {
            return floor;
        }
       
        public void setName(String name) {
            this.name = name;
        }       

        public void setArea(String area) {
            this.area = area;
        }
        public void setFloor(Double floor) {
            this.floor = floor;
        }
        public double getOpenDateTime() {
            return openDatetime;
        }
        public double getCloesDateTime() {
            return cloesDatetime;
        }
        public void setOpendatetime(double openDatetime) {
            this.openDatetime = openDatetime;
        }
        public void setCloesdatetime(double cloesDatetime) {
            this.cloesDatetime = cloesDatetime;
        }
        public LocalDateTime getOpendatetime() {
            return openDatetime;
        }
        public LocalDateTime getCloesdatetime() {
            return cloesDatetime;
        }
        public void setOpendatetime(LocalDateTime openDatetime) {
            this.openDatetime = openDatetime;
        }
        public void setCloesdatetime(LocalDateTime cloesDatetime) {
            this.cloesDatetime = cloesDatetime;
        }
    }        
        
