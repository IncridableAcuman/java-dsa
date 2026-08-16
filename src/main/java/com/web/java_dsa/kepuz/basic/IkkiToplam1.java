package com.web.java_dsa.kepuz.basic;

import java.util.*;

public class IkkiToplam1 {
    public static void main(String[] args) {
        // https://kep.uz/problems/455
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        Set<Integer> first = new HashSet<>();
        Set<Integer> second = new HashSet<>();
        first.add(a);
        first.add(b);
        second.add(c);
        second.add(d);

        first.retainAll(second);
        for (int x : first){
            System.out.print(x + " ");
        }
    }
}
