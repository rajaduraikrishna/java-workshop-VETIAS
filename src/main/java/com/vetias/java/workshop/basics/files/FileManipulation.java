package com.vetias.java.workshop.basics.files;
import java.io.File;
import java.io.IOException;
public class FileManipulation {
    public static void main(String[] args) throws IOException {
       File myNewFile = new File("Example.txt");
       myNewFile.createNewFile();
       System.out.println("File created: " + myNewFile.getAbsolutePath());
    }
}
