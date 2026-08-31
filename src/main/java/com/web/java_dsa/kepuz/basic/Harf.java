package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class Harf {
    public static void main(String[] args) {
        // https://kep.uz/problems/709
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(Character.toString((str.hashCode() + 1)));
    }
}
