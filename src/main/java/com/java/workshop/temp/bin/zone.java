package com.java.workshop.temp.bin;

public class zone {
    
        String name;
        Double zoneID;
        String type;
        Double dimension;
        
        public String getName() {
            return name;
        }   
        public Double getZoneID() {
            return zoneID;
        }
        public String getType() {
            return type;
        }
        public Double getDimension() {
            return dimension;
        }
        
        public void setName(String name) {
            this.name = name;
        }   
        public void setZoneID(Double zoneID) {
            this.zoneID = zoneID;
        }
        public void setType(String type) {
            this.type = type;
        }
        public void setDimension(Double dimension) {
            this.dimension = dimension;
        }

        @Override
        public String toString() {
            return "zone{ name" + name + 
                    ", zoneID " + zoneID +
                    ", type " + type +
                    ", dimension }" + dimension ;
    }
}
