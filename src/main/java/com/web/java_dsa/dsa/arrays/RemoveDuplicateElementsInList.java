package com.web.java_dsa.dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateElementsInList {
    public static int removeDuplicate(int[] arr,int n){
        int[] res = new int[n];
        int j=0;
        Arrays.sort(arr);
        for (int i=0;i<n-1;i++){
            if (arr[i] != arr[i+1]){
                res[j++]=arr[i];
            }
        }
        res[j++]=arr[n-1];
        for (int i=0;i<j;i++){
            arr[i]=res[i];
        }
        return j;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        n = removeDuplicate(arr,n);
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");

        }
    }
}
