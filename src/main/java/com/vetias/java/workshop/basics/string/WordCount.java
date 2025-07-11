package com.vetias.java.workshop.basics.string;

public class WordCount {

    public int count(String inputString) {
        int count = 0;
        String[] words = inputString.split(" ");
        count = words.length;
        return count;
    }
}
