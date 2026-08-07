package com.web.java_dsa.basic.dsa.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class SumCollectionElements {
    public static void main(String[] args) {
        // Collection ichidagi sonlar yig'indisini hisoblash.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        Collection<Integer> collection = new ArrayList<>();
        for (int i=1;i<=n;i++){
            System.out.print(i + "-element=");
            int k = scanner.nextInt();
            collection.add(k);
        }
        AtomicInteger sum = new AtomicInteger();
        collection.forEach(sum::addAndGet);
        System.out.println(sum);
    }
}
