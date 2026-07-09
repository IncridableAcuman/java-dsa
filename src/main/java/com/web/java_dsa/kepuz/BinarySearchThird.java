package com.web.java_dsa.kepuz;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchThird {
    public static int lowerBound(int[] arr, int key) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= key) high = mid;
            else low = mid + 1;
        }
        return low;
    }
    public static int upperBound(int[] arr, int key) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > key) high = mid;
            else low = mid + 1;
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n+1];
        for (int i=1;i<=n;i++){
            arr[i]=scanner.nextInt();
        }
        int m = scanner.nextInt();
        for (int i=0;i<m;i++){
            int x = scanner.nextInt();
            int count = upperBound(arr,x)-lowerBound(arr,x);
            System.out.println(count);
        }
    }
}
