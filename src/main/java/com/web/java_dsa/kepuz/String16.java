package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class String16 {
    public static void main(String[] args) {
        // https://kep.uz/problems/402
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i=0;i<=str.length()-3;i++){
            System.out.println(str.substring(i,i+3));
        }
    }
}
