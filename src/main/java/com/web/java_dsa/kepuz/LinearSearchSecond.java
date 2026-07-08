package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class LinearSearchSecond {
    public static int secondOneIndex(int[] arr){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==1){
                count++;
            }
            if (count==2){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int res = secondOneIndex(arr);
        System.out.println(res);
    }
}
