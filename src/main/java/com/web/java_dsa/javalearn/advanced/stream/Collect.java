package com.web.java_dsa.javalearn.advanced.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collect {
    public static void main(String[] args) {
        // Bu juda muhim.
        //
        //14. collect(Collectors.toList())
        //List<Integer> numbers =
        //        List.of(1, 2, 3, 4, 5, 6);
        //
        //Faqat juft sonlarni filter qilib, natijani yangi Listga yig‘ing.
        // forEach() ishlatmang.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        /*
        // first way
        List<Integer> pairNumbers = list
                .stream()
                .filter(x-> x % 2 == 0)
                .collect(Collectors.toList());

         */
        // second way
        List<Integer> pairNumbers = list
                .stream()
                .filter(x-> x % 2 == 0)
                .toList();

        for (Integer number : pairNumbers){
            System.out.print(number + " ");
        }
    }
}
