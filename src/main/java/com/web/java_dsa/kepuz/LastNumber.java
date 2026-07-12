package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class LastNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = String.valueOf(n);
        System.out.println(s.charAt(s.length()-1)=='5' ? "Yes":"No");
    }
}
