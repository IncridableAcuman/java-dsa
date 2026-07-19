package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class KgaBolinadiganlarFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        int sum=0;
        for (int i=a;i<=b;i++){
            if (i%k==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
