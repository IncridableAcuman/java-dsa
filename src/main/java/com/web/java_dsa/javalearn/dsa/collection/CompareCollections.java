package com.web.java_dsa.javalearn.dsa.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class CompareCollections {
    public static void main(String[] args) {
        // Collection larni compare qilish.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        Collection<Integer> first = new ArrayList<>();
        for (int i=1;i<=n;i++){
            System.out.print(i + "-element=");
            int element = scanner.nextInt();
            first.add(element);
        }
        System.out.print("m=");
        int m = scanner.nextInt();
        Collection<Integer> last = new ArrayList<>();
        for (int i=1;i<=m;i++){
            System.out.print(i + "-element=");
            int element = scanner.nextInt();
            last.add(element);
        }
        // 1. Ikki to'plam butunlay bir xilligini tekshirish (equals)
       /* if (first.equals(last)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }*/
        /*
        // 2. Ikki to'plamda umumiy (bir xil) elementlar borligini aniqlash (containsAny)
        // // Kamida bitta umumiy element borligini tekshirish
        boolean hasCommon = !Collections.disjoint(first, last);
        System.out.println("Umumiy element bormi?: " + hasCommon);
        */
        // 3. Bir to'plam ikkinchisining ichida to'liq borligini tekshirish (containsAll)
        if (last.containsAll(first)) {
            System.out.println("Birinchi to'plamning barcha elementlari ikkinchisida bor");
        }

    }
}
