package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.Scanner;
import java.util.function.Function;

/*
public class LambdaFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        //Function<String,Integer> function = (text)-> text.length(); // first way
        Function<String,Integer> function = String::length;
        System.out.println(function.apply(name));
    }
}
*/

public class LambdaFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        int a = scanner.nextInt();
        Function<Integer,Integer> function = (x)->x * x;
        System.out.println(function.apply(a));
    }
        // a=5 input
        // 25 output
}



