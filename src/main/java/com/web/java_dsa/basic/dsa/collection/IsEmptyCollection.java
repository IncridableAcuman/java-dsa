package com.web.java_dsa.basic.dsa.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/*
* Muallif: Izzatbek Abdusharipov
* Sana: 07.08.2026
* */

public class IsEmptyCollection {
    public static void main(String[] args) {
        // Collection bo'sh yoki yo'qligini tekshirish.
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        Collection<Integer> collection = List.copyOf(list);
        if (collection.isEmpty()){
            System.out.println("Collection is empty");
        } else {
            collection
                    .forEach((element)-> System.out.print(element+" "));
        }
    }
}
