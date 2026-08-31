package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class KabisaYillar1 {
    public static void main(String[] args) {
        // https://kep.uz/problems/616
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count=0;
        for (int i=a;i<=b;i++){
            if ((i%4==0 && i%100!=0) || i%400==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
