package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class ToqSon1 {
    public static void main(String[] args) {
        // https://kep.uz/problems/748
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int res=0;
        if (a%2==1 && b%2==0 && c%2==0){
            res=a;
        } else if (a%2==0 && b%2==1 && c%2==0) {
            res=b;
        } else if (a%2==0 && b%2==0 && c%2==1) {
            res=c;
        }
        System.out.println(res);
    }
}
