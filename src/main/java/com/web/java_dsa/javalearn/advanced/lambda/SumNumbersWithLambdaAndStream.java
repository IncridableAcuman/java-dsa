package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumNumbersWithLambdaAndStream {
    public static void main(String[] args) {
        // 25. Sonlar yig‘indisi
        //[10, 20, 30, 40, 50]
        //
        //Lambda + Stream yordamida barcha sonlar yig‘indisini toping.
        //
        //Output: 150
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }

        int sum = list
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }
}
