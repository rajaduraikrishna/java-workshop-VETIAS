package com.vetias.java.workshop.tempdata.beans;

import java.io.Serializable;

public class Floor implements Serializable{

    private String name;
    private int number;

    public void setName(String aName) {
        name = aName;
    }
    public String getName() {
        return name;
    }
    public void setNumber(int aNumber) {
        number = aNumber;
    }
    public int getNumber() {
        return number;
    }
    
}
