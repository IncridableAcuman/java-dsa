package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class TanaVazniIndeksi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        double h = scanner.nextDouble();

        double I = m/(Math.pow(h,2));
        System.out.println(I);
    }
}
