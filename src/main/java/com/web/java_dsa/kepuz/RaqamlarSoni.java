package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class RaqamlarSoni {
    public static void main(String[] args) {
        // https://kep.uz/problems/162
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int count=0;
        for (int i=0;i<str.length();i++){
            if (Character.isDigit(str.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
