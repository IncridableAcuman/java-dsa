package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class CheckingToCapsLook {
    public static void main(String[] args) {
        // https://kep.uz/problems/27
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        boolean upper = str.matches("[A-Z]+");
        boolean startLetter = str.matches("[a-z][A-Z]*");
        System.out.println((upper || startLetter)  ? "True" : "False");
    }
}
