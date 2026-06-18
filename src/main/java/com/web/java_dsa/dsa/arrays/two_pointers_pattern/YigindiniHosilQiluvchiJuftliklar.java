package com.web.java_dsa.dsa.arrays.two_pointers_pattern;

import java.util.Scanner;

public class YigindiniHosilQiluvchiJuftliklar {
    public static void main(String[] args) {
//        Tartiblangan massivda berilgan yig‘indini hosil qiluvchi juftlikni toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        int target = scanner.nextInt();
//        for (int i=0;i<n;i++){
//            for (int j=i+1;j<n;j++){
//                if ((nums[i] + nums[j]) == target){
//                    System.out.print("Pairs: " + nums[i] + " <-> " + nums[j] + "\n");
//                }
//            }
//        }
//        System.out.println("Two Pointers Pattern");
        int left = 0,right = nums.length - 1;
        while (left < right){
            int sum = nums[left] + nums[right];

            if (sum == target){
                System.out.print("Pairs: " + nums[left] + "<-->" + nums[right] + "\n");
                left++;
                right--;

                while (left < right && nums[left] == nums[left-1]){
                    left++;
                }
                while (left<right && nums[right] == nums[right+1]){
                    right--;
                }
            } else if (sum < target){
                left++;
            } else {
                right--;
            }
        }
    }
}
