package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class SatrPrefiksiFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();

        for (int i=0;i<s.length()-t.length();i++){
            if (t.equals(s.substring(i, t.length()))){
                System.out.println("Yes");
                break;
            } else {
                System.out.println("No");
                break;
            }
        }
    }
}
