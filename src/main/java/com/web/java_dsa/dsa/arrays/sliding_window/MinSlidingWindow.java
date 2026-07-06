package com.web.java_dsa.dsa.arrays.sliding_window;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MinSlidingWindow {
    //  Har bir oynadagi minimal elementni toping.
    public static int[] minSlidingWindow(int[] nums,int k){
        int[] res = new int[nums.length-k+1];
        int idx=0;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i=0;i<nums.length;i++){
            while (!deque.isEmpty() && deque.peekFirst()<=i-k){
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()]>nums[i]){
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
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int[] res = minSlidingWindow(arr,k);
        for (Integer integer:res){
            System.out.print(integer+" ");
        }
    }
}
