package com.vetias.java.workshop.tempdata.beans;
import java.time.LocalDate;
public record Organaization(String name, 
    String description,
    String website, 
    String email, 
    String contactNumber, 
    long registrationNumber,
    LocalDate registrationDate) {

}
