package com.web.java_dsa.basic.dsa.collection;

import java.util.*;
/*
 * Muallif: Izzatbek Abdusharipov
 * Sana: 07.08.2026
 * */
public class AddElementToCollection {
    // Element qo'shish.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int element = scanner.nextInt();
        Collection<Integer> collection = new ArrayList<>();
        collection.add(element);
        for (Integer integer:collection){
            System.out.print(integer+" ");
        }
    }
}
