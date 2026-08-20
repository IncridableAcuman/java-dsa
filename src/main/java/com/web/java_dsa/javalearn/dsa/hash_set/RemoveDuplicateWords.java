package com.web.java_dsa.javalearn.dsa.hash_set;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        // Duplicate so'zlarni olib tashlash.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet<String> set = new HashSet<>();
        for (int i=0;i<n;i++){
            String word = scanner.next();
            set.add(word);
        }
        for (String word : set){
            System.out.print(word + " ");
        }
    }
}
