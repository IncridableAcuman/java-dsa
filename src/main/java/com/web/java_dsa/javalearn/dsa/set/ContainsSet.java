package com.web.java_dsa.javalearn.dsa.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsSet {
    public static void main(String[] args) {
        // Contains().
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<n;i++){
            int k = scanner.nextInt();
            set.add(k);
        }
        System.out.println(set.contains(x) ? "Yes" : "No");
    }
}
