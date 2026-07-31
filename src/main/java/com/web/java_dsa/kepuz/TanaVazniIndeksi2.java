package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class TanaVazniIndeksi2 {
    public static void main(String[] args) {
        // https://kep.uz/problems/2067
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        double h = scanner.nextDouble();
        double I = m/Math.pow(h,2);
        if (18.5>I){
            System.out.println("Underweight");
        } else if (I>=18.5 && I<=24.9) {
            System.out.println("Normal");
        } else if (I>=25 && I<=29.9) {
            System.out.println("Overweight");
        } else if (I>=30 && I<=34.9) {
            System.out.println("Obese");
        } else if (I>35){
            System.out.println("Extremely Obese");
        }
    }
}
