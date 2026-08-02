package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class String12 {
    public static void main(String[] args) {
        // https://kep.uz/problems/398
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int k=0;
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if ((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9')){
                k++;
            }
        }
        System.out.println(k==str.length() ? "Yes":"No");
    }
}
