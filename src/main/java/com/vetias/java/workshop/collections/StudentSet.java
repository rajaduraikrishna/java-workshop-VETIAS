package com.vetias.java.workshop.collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentSet {

    public static void main(String[] args) {
        Set<Integer> rollNos = new LinkedHashSet<>();
        rollNos.add(1001);
        rollNos.add(1101);
        rollNos.add(1011);
        rollNos.add(1101);
        rollNos.add(1003);
        rollNos.add(1008);
        System.out.println(rollNos);
        
    }
}
