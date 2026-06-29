package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class MaximumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = Math.max(a,b);
        System.out.println(result);
    }
}
