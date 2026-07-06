package com.web.java_dsa.dsa.arrays.sliding_window;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MaxSlidingWindow {
    //         Har bir oynadagi maksimal elementni toping.
/*
    public static int[] maxSlidingWindow(int[] nums,int k){
        int[] res = new int[nums.length - k + 1];
        for (int i=0;i<=nums.length-k;i++){
            int max = nums[i];
            for (int j=i;j<i+k;j++){
                max=Math.max(max,nums[j]);
            }
            res[i]=max;
        }
        return res;
    }

 */
    public static int[] maxSlidingWindow(int[] nums,int k){
        int[] res = new int[nums.length-k+1];
        int idx=0;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i=0;i<nums.length;i++){
            while (!deque.isEmpty() && deque.peekFirst()<=i-k){
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] <nums[i]){
                deque.pollLast();
            }
            deque.offerLast(i);
            if (i>=k-1){
                res[idx++]=nums[deque.peekFirst()];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        int[] res = maxSlidingWindow(nums,k);
        for (Integer num : res){
            System.out.print(num+" ");
        }
    }
}
