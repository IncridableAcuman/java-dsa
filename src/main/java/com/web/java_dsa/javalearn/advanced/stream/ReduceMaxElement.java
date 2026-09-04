package com.web.java_dsa.javalearn.advanced.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReduceMaxElement {
    public static void main(String[] args) {
        // 3. reduce() — eng katta son
        //List<Integer> numbers =
        //        List.of(15, 7, 89, 23, 45, 12);
        //
        //reduce() yordamida eng katta sonni toping.
        //
        //max() ishlatmang.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        list
                .stream()
                .reduce(Integer::max)
                .ifPresent(System.out::println);
    }
}
