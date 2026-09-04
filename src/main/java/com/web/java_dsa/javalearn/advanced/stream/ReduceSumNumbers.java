package com.web.java_dsa.javalearn.advanced.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReduceSumNumbers {
    public static void main(String[] args) {
        // 1. reduce() — sonlar yig‘indisi
        //
        //Berilgan:
        //
        //List<Integer> numbers =
        //        List.of(5, 10, 15, 20, 25);
        //
        //reduce() yordamida barcha sonlarning yig‘indisini toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        list
                .stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }
}
