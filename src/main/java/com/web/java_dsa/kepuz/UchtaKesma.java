package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class UchtaKesma {
    public static void main(String[] args) {
        // https://kep.uz/problems/929
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double third = a/3.0;
        System.out.printf("%.2f %.2f\n",0.0,third);
        System.out.printf("%.2f %.2f\n",third,2*third);
        System.out.printf("%.2f %.2f\n",2*third,a);
    }
}
