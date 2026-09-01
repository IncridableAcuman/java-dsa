package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.Scanner;

interface Square{
    int square(int n);
}

public class NumberOfSquare {
    // 2. Sonning kvadratini topish
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        Square square = x->x * x;
        System.out.println(square.square(n));
    }
}
