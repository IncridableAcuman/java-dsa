package com.web.java_dsa.dsa.arrays.sliding_window;

import java.util.Scanner;
// Yig‘indisi S dan katta bo‘lgan eng kichik subarrayni toping.
public class YigindisiSBulganSubarray {
    public static int[] subArray(int[] arr,int S){
        int left=0;
        int sum=0;
        int maxLength=Integer.MAX_VALUE;
        int minStart=0;
        for (int right=0;right<arr.length;right++){
            sum+=arr[right];
            while (sum>=S){
                if (right-left+1<maxLength){
                    maxLength=right-left+1;
                    minStart=left;
                }
                sum-=arr[left];
                left++;
            }
        }
        if (maxLength==Integer.MAX_VALUE){
            return new int[0];
        }
        int[] res = new int[maxLength];
        for (int i=0;i<maxLength;i++){
            res[i]=arr[minStart+i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int S = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int[] res = subArray(arr,S);
        for (Integer integer:res){
            System.out.print(integer+" ");
        }
    }
}
