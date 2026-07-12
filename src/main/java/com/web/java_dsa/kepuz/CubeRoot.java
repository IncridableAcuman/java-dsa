package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class CubeRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double res = Math.pow(n,1./3);
        System.out.printf("%.2f",res);
    }
}
