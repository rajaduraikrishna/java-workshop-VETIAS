package com.vetias.java.workshop.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Raja");
        names.add("Durai");
        names.add("Sathish");
        names.add("Sobhan");
        names.add("Prakruti");
        names.add("Durai");
        names.add("Pradyumna");
        names.forEach(System.out::println);
        names.sort(Comparator.reverseOrder());

        System.out.println(names);

    }
}
