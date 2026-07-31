package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class MassivniToldirish1 {
    public static void main(String[] args) {
        // https://kep.uz/problems/673
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n+1];
        for (int i=1;i<=n;i++){
            arr[i]=scanner.nextInt();
        }
        for (int i=1;i<=n;i++){
            System.out.print(arr[i]+" "+i+" ");

        }

    }
}
