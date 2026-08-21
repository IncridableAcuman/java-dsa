package com.web.java_dsa.javalearn.advanced.regex;

import java.util.Scanner;

public class Only8Symbol {
    public static void main(String[] args) {
        // Berilgan String aynan 8 ta belgidan iboratligini tekshiring.
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        //boolean regex = str.matches("[a-z]{8}");
        //boolean regex = str.matches("[A-Z]{8}");
        //boolean regex = str.matches("[a-zA-Z]{8}");
        boolean regex = str.matches("[0-9]{8}");
        System.out.println(regex);
    }
}
