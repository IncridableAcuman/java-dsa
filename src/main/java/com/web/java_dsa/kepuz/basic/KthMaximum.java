package com.web.java_dsa.kepuz.basic;

import java.util.*;

public class KthMaximum {
    public static void main(String[] args) {
        // https://kep.uz/problems/967
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int t = scanner.nextInt();
            list.add(t);
        }
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list.get(k - 1));
    }
}
