package com.web.java_dsa.javalearn.advanced.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NonMatch {
    public static void main(String[] args) {
        // 9. noneMatch()
        //List<Integer> numbers =
        //        List.of(3, 7, 11, 15, 21);
        //
        //List'da juft son umuman yo‘qmi?
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        boolean isExist = list
                .stream()
                .noneMatch(x -> x % 2 == 0);
        System.out.println(isExist ? "yes" : "no");
    }
}
