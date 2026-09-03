package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class RandomGreetingWithSupplier {
    public static void main(String[] args) {
        // 12. Supplier<String>
        //
        //Supplier<String> yordamida tasodifiy greeting qaytaring:
        //
        //Hello
        //Good morning
        //Welcome
        //Hi
        String[] greetings = {"Hello","Good morning","Welcome","Hi"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        Random random = new Random();
        int index = random.nextInt(greetings.length);
        Supplier<String> supplier = ()-> greetings[index] + " " + name;
        System.out.println(supplier.get());
    }
}
