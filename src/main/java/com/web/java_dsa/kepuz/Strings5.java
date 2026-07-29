package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class Strings5 {
    public static void main(String[] args) {
        // https://kep.uz/problems/391
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String t = scanner.next();
        System.out.println(str.contains(t) ? "Yes" : "No");
    }
}
