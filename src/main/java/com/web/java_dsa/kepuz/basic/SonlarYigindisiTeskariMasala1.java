package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class SonlarYigindisiTeskariMasala1 {
    public static int sum(int n){
        if (n==1) return 1;
        return n+(n-1);
    }
    public static void main(String[] args) {
        // https://kep.uz/problems/567
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s=0;
        for (int i=1;i<=n;i++){
            s+=i;
            if (s==n){
                System.out.println(i);
            }
        }
    }
}
