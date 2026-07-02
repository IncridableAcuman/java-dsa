package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class NonstandartSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=1;i<=n;i++){
            int k = (i-1)%3+1;
            for (int j=0;j<k;j++){
                System.out.print(i+" ");
            }
        }
    }
}
