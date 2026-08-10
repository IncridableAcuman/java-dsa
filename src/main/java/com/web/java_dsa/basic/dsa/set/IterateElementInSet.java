package com.web.java_dsa.basic.dsa.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class IterateElementInSet {
    public static void main(String[] args) {
        // Iterate.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<n;i++){
            int k = scanner.nextInt();
            set.add(k);
        }
        Iterator<Integer> iterator = set
                .stream().iterator();

        iterator
                .forEachRemaining(element-> System.out.print(element + " "));
    }
}
