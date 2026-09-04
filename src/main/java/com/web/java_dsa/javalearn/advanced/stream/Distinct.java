package com.web.java_dsa.javalearn.advanced.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Distinct {
    public static void main(String[] args) {
        // 10. distinct()
        //List<Integer> numbers =
        //        List.of(1, 2, 2, 3, 3, 3, 4, 5, 5);
        // Takroriy elementlarni olib tashlang.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        list
                .stream()
                .distinct()
                .forEach(x-> System.out.print(x + " "));
    }
}
