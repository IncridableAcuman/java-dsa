package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class SumOfSquareRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum = 0;
        for (int i=1;i<=x;i++){
            sum += (int) Math.sqrt(i);
        }
        System.out.println(sum);
    }
}
