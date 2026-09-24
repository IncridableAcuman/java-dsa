package com.web.java_dsa.javalearn.arrays;

import java.util.HashSet;
import java.util.Scanner;

public class FindPairs {
    public static void findPairs(int[] arr,int target){
        HashSet<Integer> set = new HashSet<>();
        HashSet<String> pair = new HashSet<>();
        for (int j : arr){
            int complement = target - j;

            if (set.contains(complement)){
                int first = Math.min(j,complement);
                int second = Math.max(j,complement);
                String  pairKey = first + ", " + second;

                if (!pair.contains(pairKey)){
                    System.out.println("{" + first + ", " + second + "}");
                    pair.add(pairKey);
                }
            }

            set.add(j);
        }
    }
    public static void main(String[] args) {
        // Massivda yig‘indisi target ga teng bo‘lgan barcha juftliklarni toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        findPairs(arr,target);
    }
}
