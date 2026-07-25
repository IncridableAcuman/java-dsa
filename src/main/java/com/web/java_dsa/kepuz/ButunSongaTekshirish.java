package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class ButunSongaTekshirish {
    public static void main(String[] args) {
        // https://kep.uz/problems/138
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int count=0;
        try {
            int t = Integer.parseInt(str);
            System.out.println(String.valueOf(t).equals(str) ? "Yes" : "No");
        } catch (RuntimeException e) {
            System.out.println("No");
        }
    }
}
