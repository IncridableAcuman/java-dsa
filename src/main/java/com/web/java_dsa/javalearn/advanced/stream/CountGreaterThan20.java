package com.web.java_dsa.javalearn.advanced.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountGreaterThan20 {
    public static void main(String[] args) {
        // 4. count()
        //List<Integer> numbers =
        //        List.of(12, 5, 8, 21, 30, 17, 44, 3);
        //
        //Stream yordamida 20 dan katta sonlar nechta ekanligini aniqlang.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
       long count = list
                .stream()
               .filter(x->x>20)
               .count();
        System.out.println(count);
    }
}
