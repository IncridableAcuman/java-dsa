package com.web.java_dsa.dsa.arrays.frequency_and_counting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EngKupUchraganSon {
    public static void main(String[] args) {
//        Eng ko‘p uchraydigan elementni toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxNum = nums[0];
        int maxCount=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > maxCount){
                maxCount = entry.getValue();
                maxNum = entry.getKey();
            }
        }
        System.out.println("Eng ko'p uchragan son: " + maxNum + " Soni: " + maxCount);
    }
}
