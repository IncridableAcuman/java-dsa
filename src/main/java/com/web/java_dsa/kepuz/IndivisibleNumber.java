package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class IndivisibleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int k=0;
        for (int i=1;i<=a;i++){
            if (a%i!=0){
                k=i;
                break;
            }
        }
        System.out.println(k);
    }
}
