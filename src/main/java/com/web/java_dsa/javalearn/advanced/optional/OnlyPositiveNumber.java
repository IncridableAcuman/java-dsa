package com.web.java_dsa.javalearn.advanced.optional;

import java.util.Optional;
import java.util.Scanner;

public class OnlyPositiveNumber {
    public static void main(String[] args) {
        // 8. Optional<Integer> berilgan. Faqat musbat sonni qabul qiling.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        Optional<Integer> optional = Optional.of(n);
        optional
                .filter(x->x>0)
                .ifPresentOrElse((num)-> System.out.println("Positive: " + num),()-> System.out.println("Only positive number"));
    }
}
