package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class BoluvchilariYigindisi1 {
    public static void main(String[] args) {
        // https://kep.uz/problems/840
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                sum +=i;
            }
        }
        System.out.println(sum);
    }
}
