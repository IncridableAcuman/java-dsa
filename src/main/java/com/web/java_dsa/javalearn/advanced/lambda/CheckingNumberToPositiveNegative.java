package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.Scanner;
import java.util.function.Predicate;

public class CheckingNumberToPositiveNegative {
    public static void main(String[] args) {
        // 10. Predicate<Integer>
        //
        //Predicate<Integer> yordamida sonning:
        //
        //musbat
        //manfiy
        //juft
        //10 dan katta
        //
        //ekanligini tekshiruvchi lambda'lar yarating.
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        int a = scanner.nextInt();
        Predicate<Integer> positiveOrNegative = (x)-> x > 0;
        System.out.println(positiveOrNegative.test(a));
        Predicate<Integer> pair = x-> x % 2 == 0;
        System.out.println(pair.test(a));
        Predicate<Integer> graterThanTen = x -> x > 10;
        System.out.println(graterThanTen.test(a));
    }
}
