package com.web.java_dsa.kepuz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Massiv5 {
    public static void main(String[] args) {
        // https://kep.uz/problems/374
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        int min = list.get(0),k=0;
        for (int i=0;i<list.size();i++){
            if (list.get(i)<min){
                min=list.get(i);
                k=i;
            }
        }
        System.out.println(k+1);
    }
}
