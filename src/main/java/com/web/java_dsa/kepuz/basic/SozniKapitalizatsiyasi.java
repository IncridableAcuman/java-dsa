package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class SozniKapitalizatsiyasi {
    public static void main(String[] args) {
        // https://kep.uz/problems/572
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(String.valueOf(str.toUpperCase().charAt(0)).concat(str.substring(1)));
    }
}
