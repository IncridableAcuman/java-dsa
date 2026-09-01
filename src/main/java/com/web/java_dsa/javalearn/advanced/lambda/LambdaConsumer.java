package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.Scanner;
import java.util.function.Consumer;

public class LambdaConsumer {
    public static void main(String[] args) {
        /*Consumer<T>

        Qiymatni qabul qiladi, lekin hech narsa qaytarmaydi.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        // Consumer<String> consumer = (n)-> System.out.println(n); // first way
        Consumer<String> consumer = System.out::println;
        consumer.accept(name);
    }
}
