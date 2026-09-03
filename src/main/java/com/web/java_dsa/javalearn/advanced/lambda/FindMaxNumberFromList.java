package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.*;

public class FindMaxNumberFromList {
    public static void main(String[] args) {
        //17. Eng katta sonni topish
        //
        //List ichidan lambda yordamida eng katta sonni toping.
        //
        //[12, 45, 7, 89, 34, 21]
        //
        //Output:
        //89
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list length: ");
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        /* // first way
        Optional<Integer> element = list
                .stream()
                .max((x,y)-> Math.max(x,y));

                 Optional<Integer> element = list
                .stream()
                .max(Math::max);

        System.out.println(element);
        */
        // second way
        Optional<Integer> maxElement = list
                .stream()
                .max(Comparator.naturalOrder());
        System.out.println(maxElement.get());
    }
}
