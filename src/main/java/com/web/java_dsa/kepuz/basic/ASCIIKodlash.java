package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class ASCIIKodlash {
    public static void main(String[] args) {
        // https://kep.uz/problems/621
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int sum=0;
        for (int i=0;i<str.length();i++){
            sum += str.codePointAt(i);
        }
        System.out.println(sum);
    }
}
