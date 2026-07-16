package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class KvadratlarYigindisiFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum=0;
        for (int i=1;i<=a;i++){
            sum+=(i*i);
        }
        System.out.println(sum);
    }
}
