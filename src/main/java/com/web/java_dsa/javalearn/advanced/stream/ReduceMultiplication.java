package com.web.java_dsa.javalearn.advanced.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReduceMultiplication {
    public static void main(String[] args) {
        // 2. reduce() — ko‘paytma
        //List<Integer> numbers =
        //        List.of(2, 3, 4, 5);
        //
        //reduce() yordamida barcha sonlarning ko‘paytmasini toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        list
                .stream()
                .reduce((a,b) -> a * b)
                .ifPresent(System.out::println);
    }
}
