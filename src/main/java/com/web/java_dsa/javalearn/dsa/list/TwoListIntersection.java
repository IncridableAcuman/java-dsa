package com.web.java_dsa.javalearn.dsa.list;

import java.util.*;

public class TwoListIntersection {
    public static void main(String[] args) {
        // Ikki List intersection.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> first = new ArrayList<>();
        for (int i=0;i<n;i++){
            int element = scanner.nextInt();
            first.add(element);
        }
        int m = scanner.nextInt();
        List<Integer> second = new ArrayList<>();
        for (int i=0;i<m;i++){
            int element = scanner.nextInt();
            second.add(element);
        }
        Set<Integer> set = new HashSet<>(second);

        List<Integer> list = first
                .stream()
                .filter(set::contains)
                .toList();
        for (int x : list){
            System.out.print(x + " ");
        }
    }
}
