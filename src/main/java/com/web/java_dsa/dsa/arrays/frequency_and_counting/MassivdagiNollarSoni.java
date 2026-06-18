package com.web.java_dsa.dsa.arrays.frequency_and_counting;

import java.util.Scanner;

public class MassivdagiNollarSoni {
    public static void main(String[] args) {
//        Massivda 0 soni necha marta qatnashganini toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        int count=0;
        for (Integer num : nums){
            if (num == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
