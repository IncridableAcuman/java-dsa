package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class BinarySearchThird {
    public static int binarySearchThird(int[] arr,int x){
        int count=0;
        for (int j : arr) {
            if (j == x) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n+1];
        for (int i=1;i<=n;i++){
            arr[i]=scanner.nextInt();
        }
        int m = scanner.nextInt();
        for (int i=1;i<=m;i++){
            int x = scanner.nextInt();
            System.out.println(binarySearchThird(arr,x));
        }
    }
}
