package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean res = (a > b && a % b == 0) || (b > a && b % a == 0);
        System.out.println( res ? "True":"False");
    }
}
