package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class String13 {
    public static void main(String[] args) {
        // https://kep.uz/problems/399
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) != ' '){
                System.out.print(str.charAt(i));
            }
        }
    }
}
