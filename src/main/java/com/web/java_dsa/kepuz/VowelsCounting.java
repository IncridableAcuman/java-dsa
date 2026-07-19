package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class VowelsCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int count=0;
        for (int i=0;i<str.length();i++){
            char c = str.toLowerCase().charAt(i);
            if (c=='a' || c=='e' || c=='u' || c=='i' || c=='o'){
                count++;
            }
        }
        System.out.println(count);
    }
}
