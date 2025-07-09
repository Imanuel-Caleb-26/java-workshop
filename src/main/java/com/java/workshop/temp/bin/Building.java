package com.java.workshop.temp.bin;

import java.time.LocalDateTime;

public class Building {
    private String name;
    private String area;
    private Double floor;
    private LocalDateTime openDatetime;
    private LocalDateTime closeDatetime;

    public String getName() {
        return name;
    }

    public String getArea() {
        return area;
    }

    public Double getFloor() {
        return floor;
    }

    public LocalDateTime getOpenDatetime() {
        return openDatetime;
    }

    public LocalDateTime getCloseDatetime() {
        return closeDatetime;
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

    public void setOpenDatetime(LocalDateTime openDatetime) {
        this.openDatetime = openDatetime;
    }

    public void setCloseDatetime(LocalDateTime closeDatetime) {
        this.closeDatetime = closeDatetime;
    }

    
    public void printDetails() {
        System.out.println("Building Name: " + name);
        System.out.println("Area: " + area);
        System.out.println("Floor: " + floor);
        System.out.println("Open DateTime: " + openDatetime);
        System.out.println("Close DateTime: " + closeDatetime);
    }
}
