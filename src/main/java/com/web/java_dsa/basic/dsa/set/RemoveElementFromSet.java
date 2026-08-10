package com.web.java_dsa.basic.dsa.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveElementFromSet {
    public static void main(String[] args) {
        // Remove().
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<n;i++){
            int k = scanner.nextInt();
            set.add(k);
        }
        for (int st : set){
            if (st == x){
                set.remove(st);
            }
        }
        for (int y : set){
            System.out.print(y + " ");
        }
    }
}
