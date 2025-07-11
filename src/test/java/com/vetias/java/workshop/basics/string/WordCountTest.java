package com.vetias.java.workshop.basics.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCountTest {
   
    @Test
    public void testWordCount() {
        WordCount wordCount = new WordCount();
        int count = wordCount.count("This is a java program to test the string split");
        Assertions.assertEquals(10, count);
    }

    @Test
    public void testAnotherString() {
        WordCount wordCount = new WordCount();
        int count = wordCount.count("Raja Durai Krishnamoorthy");
        Assertions.assertEquals(3, count);
    }
}
