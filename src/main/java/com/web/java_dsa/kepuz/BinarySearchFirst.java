package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class BinarySearchFirst {
    public static int binarySearch(int[] arr,int left,int right,int x){
        while (left<=right){
            int mid=(left+right)/2;
            if (arr[mid]==x){
                return mid;
            }else

            if (arr[mid]>x){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return -1;
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
            if (binarySearch(arr,1,n,x) !=-1){
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
