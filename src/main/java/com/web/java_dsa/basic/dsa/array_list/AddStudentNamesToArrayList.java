package com.web.java_dsa.basic.dsa.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AddStudentNamesToArrayList {
    public static void main(String[] args) {
        // Student nomlarini ArrayList ga qo'shing.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Student name: ");
        String studentName = scanner.next();
        String[] studentNames = {"Izzatbek","Ismoil","Abrorbek","Bahrom","Isobek"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(studentNames));
        list.add(studentName);
        for (String name : list){
            System.out.println(name + " ");
        }
    }
}
