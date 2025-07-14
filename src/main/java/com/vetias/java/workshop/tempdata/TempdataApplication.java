package com.vetias.java.workshop.tempdata;

import java.time.LocalDate;

import com.vetias.java.workshop.tempdata.beans.Organaization;

public class TempdataApplication {
    public static void main(String[] args) {
        Organaization vet = new Organaization("Vellalar Educational Trust",
            "Thindal" , 
            "www.vet.com", 
            "contact@vet.com", 
            "+91-9873647389",
             2000938473, 
             LocalDate.of(1960, 4, 23));

        System.out.println(vet);
        System.out.println(vet.name());
        System.out.println(vet.email());
    }
}
