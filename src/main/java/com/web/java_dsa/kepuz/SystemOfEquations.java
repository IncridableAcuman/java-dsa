package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class SystemOfEquations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double d = Math.sqrt((a*a - 4*b));
       double x=(a+d)/2;
       double y=(a-d)/2;
        System.out.println(x+" "+y);
    }
}
