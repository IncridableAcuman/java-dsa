package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class String8 {
    public static void main(String[] args) {
        // https://kep.uz/problems/394
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count=0;
        char a = 'a' | 'e' | 'i' | 'o' | 'u';
        for (int i=0;i<str.length();i++){
            char c = str.toLowerCase().charAt(i);
            if (c == 'a' || c=='u' || c=='e' || c=='i' || c=='o'){
                count++;
            }
        }
        System.out.println(count);
    }
}
