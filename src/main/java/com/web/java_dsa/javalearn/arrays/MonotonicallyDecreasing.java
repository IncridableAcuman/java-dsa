package com.web.java_dsa.javalearn.arrays;

import java.util.Scanner;

public class MonotonicallyDecreasing {
    public static boolean monotonicallyDecreasing(int[] arr){
        boolean isMonotonicallyDecreasing = true;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] < arr[i + 1]){
                isMonotonicallyDecreasing=false;
                break;
            }
        }
        return isMonotonicallyDecreasing;
    }
    public static void main(String[] args) {
        // Massivning monoton kamayuvchi ekanligini tekshiring.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        boolean res = monotonicallyDecreasing(arr);
        System.out.print(res);
    }
}
