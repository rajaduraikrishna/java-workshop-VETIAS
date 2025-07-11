package com.vetias.java.workshop.streams;

import java.util.ArrayList;
import java.util.List;

public class NamesStartsWithSCount {


    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Raja");
        names.add("Durai");
        names.add("Sathish");
        names.add("Sobhan");
        names.add("Prakruti");
        names.add("Durai");
        names.add("Sathish");
        names.add("Pradyumna");
        names.add("Sathishkumar Thyagarajan");
        long nameCount = names.stream()
        .filter(name -> name.startsWith("S"))
        .distinct().count();
        System.out.println(nameCount);
    }
}
