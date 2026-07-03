package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class DivisibleByFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count=0;
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        for (int i=min;i<=max;i++){
            if (i%4==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
