package com.vetias.java.workshop.tempdata.beans;

import java.time.LocalDateTime;

public class Building {
    private String name;
    private double area;
    private int floors;
    private LocalDateTime openDateTime; 
    private LocalDateTime closeDateTime;

    public void setName(String aName) {
        name = aName;
    }
    public String getName() {
        return name;
    }
    public void setArea(double anArea) {
        area = anArea;
    }
    public double getArea() {
        return area;
    }
    public void setFloors(int aFloors) {
        floors = aFloors;
    }
    public int getFloors() {
        return floors;
    }
    public void setOpenDateTime(LocalDateTime anOpenDateTime) {
        openDateTime = anOpenDateTime;
    }
    public LocalDateTime getOpenDateTime() {
        return openDateTime;
    }
    public void setCloseDateTime(LocalDateTime aCloseDateTime) {
        closeDateTime = aCloseDateTime;
    }
    public LocalDateTime getCloseDateTime() {
        return closeDateTime;
    }

    public void printDetails() {
        System.out.println("Building Name: " + name);
        System.out.println("Area: " + area + " sq.m");
        System.out.println("Floors: " + floors);
        System.out.println("Open DateTime: " + openDateTime);
        System.out.println("Close DateTime: " + closeDateTime);
    }
    
}

   
    