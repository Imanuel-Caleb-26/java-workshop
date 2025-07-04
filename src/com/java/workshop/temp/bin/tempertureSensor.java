package com.java.workshop.temp.bin;

public class tempertureSensor implements Sensor {

    private float temperature;
   
    public tempertureSensor(float atemperature) {
        temperature = atemperature;
    }

    public float getReading(){
        return temperature;
    }
    
}
