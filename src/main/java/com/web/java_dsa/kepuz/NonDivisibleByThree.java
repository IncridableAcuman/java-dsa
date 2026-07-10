package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class NonDivisibleByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=1;i<=n;i++){
            if (i%3!=0){
                System.out.print(i+" ");
            }
        }
    }
}
