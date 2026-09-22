package com.web.java_dsa.javalearn.arrays;

import java.util.Scanner;

public class MonotonicallyIncreasing {
    public static boolean monotonicallyIncreasing(int[] arr){
        boolean isMonotonicallyIncreasing = true;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]) {
                isMonotonicallyIncreasing = false;
                break;
            }
        }
        return isMonotonicallyIncreasing;
    }
    public static void main(String[] args) {
        // Massivning monoton o‘suvchi ekanligini tekshiring.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        boolean res = monotonicallyIncreasing(arr);
        System.out.print(res);
    }
}
