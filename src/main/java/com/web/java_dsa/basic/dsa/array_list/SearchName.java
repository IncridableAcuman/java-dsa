package com.web.java_dsa.basic.dsa.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SearchName {
    public static void main(String[] args) {
        // Ism qidiring.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Search something name: ");
        String studentName = scanner.next();
        String[] studentNames = {"Izzatbek","Ismoil","Abrorbek","Bahrom","Isobek"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(studentNames));
        if (list.contains(studentName)){
            System.out.println("This name has found: " + studentName);
        } else {
            System.out.println("This name has not found : " + studentName);
        }
    }
}
