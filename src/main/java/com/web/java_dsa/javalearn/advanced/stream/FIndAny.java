package com.web.java_dsa.javalearn.advanced.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FIndAny {
    public static void main(String[] args) {
        // 6. findAny()
        //
        //Yuqoridagi List'dan 15 dan katta istalgan sonni toping.
        //
        //Bu masalada findAny() ishlating.
        //
        //Natija har doim bir xil bo‘lishi shart emas.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        list
                .parallelStream() // random uchun bo'lmasa oddiy stream bo'ladi ketma-ketlikda olish kerak bo'lsa
                .filter(x->x>15)
                .findAny()
                .ifPresent(System.out::println);
    }
}
