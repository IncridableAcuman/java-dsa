package com.web.java_dsa.dsa.arrays.sliding_window;

import java.util.Scanner;
// Yig‘indisi S dan katta bo‘lgan eng kichik subarrayni toping.
public class YigindisiSBulganSubarray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
    }
}
