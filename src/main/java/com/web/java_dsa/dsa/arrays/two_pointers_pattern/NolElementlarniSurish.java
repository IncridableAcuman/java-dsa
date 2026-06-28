package com.web.java_dsa.dsa.arrays.two_pointers_pattern;

import java.util.Scanner;

public class NolElementlarniSurish {
//     Nol elementlarni oxiriga suring.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int insertIndex=0;
        for (int i=0;i<n;i++){
            if (arr[i] !=0){
                arr[insertIndex]=arr[i];
                insertIndex++;
            }
        }
        while (insertIndex<arr.length){
            arr[insertIndex]=0;
            insertIndex++;
        }
        for (Integer integer:arr){
            System.out.print(integer+" ");
        }
    }
}
