package com.web.java_dsa.javalearn.dsa.array_list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OnlyUniqueElements {
    public static void main(String[] args) {
        // Faqat unique elementlarni saqlang.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        Set<Integer> set = new HashSet<>(list);
        for (int x : set){
            System.out.print(x + " ");
        }
    }
}
