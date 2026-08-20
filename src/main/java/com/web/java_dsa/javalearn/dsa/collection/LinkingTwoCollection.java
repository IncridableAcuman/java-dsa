package com.web.java_dsa.javalearn.dsa.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class LinkingTwoCollection {
    public static void main(String[] args) {
        // Ikki Collection ni birlashtirish.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        Collection<Integer> collectionFirst = new ArrayList<>();
        for (int i=0;i<n;i++){
            System.out.print((i+1) + "-element=");
            int k = scanner.nextInt();
            collectionFirst.add(k);
        }
        System.out.print("m=");
        int m = scanner.nextInt();
        Collection<Integer> collectionSecond = new ArrayList<>();
        for (int i=0;i<m;i++){
            System.out.print((i+1) + "-element=");
            int k = scanner.nextInt();
            collectionSecond.add(k);
        }
        collectionFirst.addAll(collectionSecond);
        for (int element:collectionFirst){
            System.out.print(element + " ");
        }
    }
}
