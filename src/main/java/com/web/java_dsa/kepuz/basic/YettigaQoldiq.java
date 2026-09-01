package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class YettigaQoldiq {
    public static void main(String[] args) {
        // https://kep.uz/problems/712
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=1;i<=n;i++){
            if (i%7==1 || i%7==3){
                System.out.print(i + " ");
            }
        }
    }
}
