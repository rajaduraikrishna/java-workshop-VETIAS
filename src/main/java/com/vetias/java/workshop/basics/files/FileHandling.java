package com.vetias.java.workshop.basics.files;
import java.io.File;
public class FileHandling {

    public static void main(String[] args) {
        File file = new File("src");
        if (file.exists()) {
            System.out.println("File exists: " + file.getAbsolutePath());
        } else {
            System.out.println("File does not exist.");
        }
        if (file.isDirectory()) {
            System.out.println("It is a directory.");
            File[] files = file.listFiles();
            if (files != null) {
                System.out.println("Files in the directory:");
                for (File f : files) {
                    System.out.println(f.getName());
                }
            } else {
                System.out.println("The directory is empty or an I/O error occurred.");
            }
        } else {
            System.out.println("It is not a directory.");
        }

    }

}
