package com.web.java_dsa.javalearn.dsa.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/*
* Muallif: Izzatbek
* Sana: 06.08.2026
* */

public class AllCollectionElements {
    // Collection ichidagi barcha elementlarni chiqarish.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        Collection<Integer> collection = List.copyOf(list);
        for (int element:collection){
            System.out.print(element+" ");
        }
    }
}
