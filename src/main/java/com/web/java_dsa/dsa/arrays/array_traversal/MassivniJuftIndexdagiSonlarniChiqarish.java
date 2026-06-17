package com.web.java_dsa.dsa.arrays.array_traversal;

import java.util.Scanner;

public class MassivniJuftIndexdagiSonlarniChiqarish {
    public static void main(String[] args) {
//        Massivdagi faqat juft indeksdagi elementlarni chiqaring.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        for (int i=0;i<n;i++){
            if (i %2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
//    N=5
//    1 2 3 4 5
//    1 -> 0-index
//    2 -> 1-index
//    3 -> 2-index
//    4 -> 3-index
//    5 -> 4-index
}
