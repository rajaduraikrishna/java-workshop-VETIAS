package com.vetias.java.workshop.basics.arrays;

import java.util.Arrays;

public class StudentDetails {
    public static void main(String[] args) {
        String[][] students = new String[63][2];
        students[0][0] = "100023";
        students[0][1] = "Rajadurai";
        students[1][0] = "100004";
        students[1][1] = "Sobhan";
        for(String[] student : students) {
           System.out.println(Arrays.toString(student));

        }
    }

}
