package com.web.java_dsa.javalearn.advanced.exceptionHandling;

import java.util.Scanner;

public class StringParsing {
    public static void main(String[] args) {
        // 43. Stringni integerga aylantirishda yuzaga keladigan exceptionni ushlang.
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("a=");
            String a = scanner.next();
            System.out.print("b=");
            String b = scanner.next();
            Integer max = Math.max(Integer.parseInt(a),Integer.parseInt(b));
            System.out.println(max);
        } catch (NumberFormatException exception){
            System.out.println(exception.getLocalizedMessage());
        }
    }
}
