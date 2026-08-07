package com.web.java_dsa.basic.dsa.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class RemoveElementFromCollection {
    public static void main(String[] args) {
        // Element o'chirish.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        System.out.print("element=");
        int element = scanner.nextInt();
        Collection<Integer> collection = new ArrayList<>();
        for (int i=0;i<n;i++){
            System.out.print((i+1) + "-element=");
            int k = scanner.nextInt();
            collection.add(k);
        }
        collection
                .remove(element);
        for (int el:collection){
            System.out.print(el + " ");
        }
    }
}
