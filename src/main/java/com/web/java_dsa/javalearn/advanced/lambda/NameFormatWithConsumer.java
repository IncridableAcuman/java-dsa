package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.Scanner;
import java.util.function.Consumer;

public class NameFormatWithConsumer {
    public static void main(String[] args) {
        // 11. Consumer<String>
        //
        //Consumer<String> yordamida String'ni quyidagi formatda chiqarish:
        //
        //Name: Izzatbek
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        Consumer<String> consumer = (x)-> System.out.println("Your name is " + x);
        consumer.accept(name);
    }
}
