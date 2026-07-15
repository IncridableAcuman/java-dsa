package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class OraliqFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count=0;
        for (int i=a;i<=b;i++){
            count++;
        }
        System.out.println(count);
    }
}
