package com.web.java_dsa.kepuz;

import java.util.Arrays;
import java.util.Scanner;

public class SonlarMedianasi {
    public static void main(String[] args) {
        // https://kep.uz/problems/96
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(n%2==1 ? arr[n/2] : arr[n/2-1]);
    }
}
