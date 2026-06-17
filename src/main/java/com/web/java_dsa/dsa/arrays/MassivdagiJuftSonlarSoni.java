package com.web.java_dsa.dsa.arrays;

import java.util.Scanner;

public class MassivdagiJuftSonlarSoni {
    public static void main(String[] args) {
//        Massivdagi juft sonlar sonini aniqlang.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i=0;i<n;i++){
            if (arr[i]%2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
