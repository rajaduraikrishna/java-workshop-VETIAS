package com.vetias.java.workshop.collections;

import java.util.HashMap;
import java.util.Map;
public class StudentMap {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1006, "Mithun");
        students.put(1002, "Sarvesh");
        students.put(1201, "Abarna");
        students.put(1323, "Sowmya");
        students.put(1016,  "Anand Raj");
        students.put(1401, "Sowmya");
        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());

    }

}
