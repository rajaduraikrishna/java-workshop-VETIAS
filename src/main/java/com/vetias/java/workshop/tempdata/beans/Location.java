package com.vetias.java.workshop.tempdata.beans;

import java.io.Serializable;

public class Location implements Serializable {
    private String name;
    private double latitude;
    private double longitude;
    private String description;
    private String country;
    private String city;
    private String address;
    private String postalCode;

    public void setName(String aName) {
        name = aName;
    }

    public String getName() {
        return name;
    }

    public void setLatitude(double alatitude) {
        latitude = alatitude;
    }

    public double getLatitude() {
        return latitude;
    }
    public void setLongitude(double alongitude) {
        longitude = alongitude;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setDescription(String aDescription) {
        description = aDescription;
    }
    public String getDescription() {
        return description;
    }
    public void setCountry(String aCountry) {
        country = aCountry;
    }
    public String getCountry() {
        return country;
    }
    public void setCity(String aCity) {
        city = aCity;
    }
    public String getCity() {
        return city;
    }
    public void setAddress(String anAddress) {
        address = anAddress;
    }
    public String getAddress() {
        return address;
    }
    public void setPostalCode(String aPostalCode) {
        postalCode = aPostalCode;
    }
    public String getPostalCode() {
        return postalCode;
    }
    
}
