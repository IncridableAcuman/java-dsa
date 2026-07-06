package com.web.java_dsa.dsa.arrays.matrix;

import java.util.Scanner;

// Matrix ichidagi eng katta elementni toping.
public class MaxElementInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        int maxElement = arr[0][0];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (arr[i][j] > maxElement){
                    maxElement = arr[i][j];
                }
            }
        }
        System.out.println(maxElement);
    }
}
