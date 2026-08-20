package com.web.java_dsa.javalearn.dsa.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDublicateElements {
    public static void main(String[] args) {
        // Collection ichidan duplicate elementlarni olib tashlash.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        Collection<Integer> collection = new ArrayList<>();
        for (int i=1;i<=n;i++){
            System.out.print(i + "-element=");
            int element = scanner.nextInt();
            collection.add(element);
        }
        Collection<Integer> setCollection = new LinkedHashSet<>(collection);
        for (int element : setCollection){
            System.out.print(element + " ");
        }

    }
}
