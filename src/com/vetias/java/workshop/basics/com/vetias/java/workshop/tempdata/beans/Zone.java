package com.vetias.java.workshop.tempdata.beans;

public class Zone {
    private String name;
    private int zoneId; 
    private String type;
    private double area;

    public void setName(String aName) {
        name = aName;
    }
    public String getName() {
        return name;
    }
    public void setZoneId(int aZoneId) {
        zoneId = aZoneId;
    }



    public int getZoneId() {
        return zoneId;
    }
    public void setType(String aType) {
        type = aType;
    }
    public String getType() {
        return type;
    }
    public void setArea(double anArea) {
        area = anArea;
    }
    public double getArea() {
        return area;
    }
    
}
