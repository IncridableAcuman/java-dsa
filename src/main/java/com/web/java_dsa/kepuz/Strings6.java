package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class Strings6 {
    public static void main(String[] args) {
        // https://kep.uz/problems/392
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
            if (i<str.length()-1){
                System.out.print(" ");
            }
        }
    }
}
