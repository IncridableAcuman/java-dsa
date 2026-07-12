package com.web.java_dsa.dsa.arrays.matrix;

import java.util.Scanner;

public class SumDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n+1][n+1];
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        int sum=0;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==j){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
