package com.web.java_dsa.javalearn.advanced.regex;

import java.util.Scanner;

public class CheckingFilenameExtensions {
    public static void main(String[] args) {
        // Berilgan fayl nomi .jpg, .jpeg, .png yoki .gif
        // kengaytmalaridan biri bilan tugashini tekshiring.
        Scanner scanner = new Scanner(System.in);
        String file = scanner.next();
        String regex = ".*\\.(jpg|jpeg|png|gif)$";
        System.out.println(file.matches(regex));
    }
}
