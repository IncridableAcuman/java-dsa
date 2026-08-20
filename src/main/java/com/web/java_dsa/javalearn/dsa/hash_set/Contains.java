package com.web.java_dsa.javalearn.dsa.hash_set;

import java.util.HashSet;
import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {
        // Contains.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<n;i++){
            int k = scanner.nextInt();
            set.add(k);
        }
        System.out.println(set.contains(x) ? "Yes" : "No");
        scanner.close();
    }
}
