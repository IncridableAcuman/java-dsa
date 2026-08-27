package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class SakkizVaOlti {
    public static void main(String[] args) {
        // https://kep.uz/problems/421
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count=0;
        for (int i=1;i<=n;i++){
            if (i%6==0 && i%8==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
