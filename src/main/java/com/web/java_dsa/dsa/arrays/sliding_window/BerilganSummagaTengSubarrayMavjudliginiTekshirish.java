package com.web.java_dsa.dsa.arrays.sliding_window;

import java.util.Arrays;
import java.util.Scanner;

public class BerilganSummagaTengSubarrayMavjudliginiTekshirish {
    // Berilgan summaga teng subarray mavjudligini aniqlang.
    public static int[] subArray(int[] arr,int targetSum){
        int left=0;
        int windowSum=0;
        int maxLength=Integer.MAX_VALUE;
        int start=0;
        for (int right=0;right<arr.length;right++){
            windowSum+=arr[right];
            while (windowSum>targetSum && left<=right){
                windowSum-=arr[left];
                left++;
            }
            if (windowSum==targetSum){
                return Arrays.copyOfRange(arr,left,right+1);
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int targetSum = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int[] res = subArray(arr,targetSum);
        for (int t:res){
            System.out.print(t+" ");
        }
    }
}
