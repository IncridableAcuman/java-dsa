package com.web.java_dsa.dsa.arrays.array_traversal;

import java.util.Scanner;

public class MassivToqIndexdagiElementlariniChiqarish {
    public static void main(String[] args) {
//        Massivdagi faqat toq indeksdagi elementlarni chiqaring.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        for (int i=0;i<n;i++){
            if (i %2 == 1){
                System.out.print(arr[i] + " ");
            }
        }
//        index 0-dan boshlangan
    }
}
