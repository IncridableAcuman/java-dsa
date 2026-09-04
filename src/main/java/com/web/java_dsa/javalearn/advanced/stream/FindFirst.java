package com.web.java_dsa.javalearn.advanced.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindFirst {
    public static void main(String[] args) {
        // 5. findFirst()
        //List<Integer> numbers =
        //        List.of(5, 8, 12, 15, 20, 25);
        //
        //Stream yordamida 10 dan katta birinchi sonni toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        list
                .stream()
                .filter(x->x>10)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
