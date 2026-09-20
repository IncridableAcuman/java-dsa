package com.web.java_dsa.javalearn.advanced.exceptionHandling;

import java.util.Scanner;

public class NolgaBolishHolatiniUshlang {
    public static void main(String[] args) {
        // 41. Nolga bo‘lish holatini ushlang.
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int res = a / b;
            System.out.println(res);
        } catch (ArithmeticException exception){
            System.out.println("Nolga bo'lib bo'lmaydi");
        }
    }
}
