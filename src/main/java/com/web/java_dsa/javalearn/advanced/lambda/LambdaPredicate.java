package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.Scanner;
import java.util.function.Predicate;

// sonni juftlikka tekshirish Predicate tayyor interface orqali
public class LambdaPredicate {
    public static void main(String[] args) {
        /*Predicate<T>
          Biror narsani tekshiradi.*/
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Predicate<Integer> candidate = (x)->x%2==0;
        System.out.println(candidate.test(a));
    }
}
