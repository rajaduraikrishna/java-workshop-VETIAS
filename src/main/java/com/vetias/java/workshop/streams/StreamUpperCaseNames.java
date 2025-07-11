package com.vetias.java.workshop.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamUpperCaseNames {

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
        names.stream()
        .filter(name -> name.startsWith("S") || name.startsWith("s"))
        .distinct().map(String::toUpperCase).forEach(System.out::println);
    }

}
