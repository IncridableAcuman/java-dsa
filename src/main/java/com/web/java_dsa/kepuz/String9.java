package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class String9 {
    public static void main(String[] args) {
        // https://kep.uz/problems/395
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count=0;
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if (Character.isAlphabetic(c)){
                count++;
            }
        }
        System.out.println(count);
    }
}
