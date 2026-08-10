package com.web.java_dsa.basic.dsa.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDublicateElementsFromSet {
    public static void main(String[] args) {
        // Duplicate elementlarni olib tashlash.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<n;i++){
            int k = scanner.nextInt();
            set.add(k);
        }
        set
                .forEach(element-> System.out.print(element + " "));
    }
}
