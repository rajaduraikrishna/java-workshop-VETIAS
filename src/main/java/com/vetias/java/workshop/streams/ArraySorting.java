package com.vetias.java.workshop.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraySorting {

    public static void main(String[] args) {
        List<Integer> markList = Arrays.asList(90,99,100,98,96);
        markList.stream().sorted().forEach(System.out::println);
        markList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println(markList.stream().max(Comparator.naturalOrder()).get());
    }
}
