package com.web.java_dsa.kepuz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BirMartaUchraganSon1 {
    public static int birMartaUchraganSon(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer integer:arr){
            map.put(integer,map.getOrDefault(integer,0)+1);
        }
        int element=0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue()==1){
                element=entry.getKey();
            }
        }
        return element;
    }
    public static void main(String[] args) {
        // https://kep.uz/problems/466
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int res = birMartaUchraganSon(arr);
        System.out.println(res);
    }
}
