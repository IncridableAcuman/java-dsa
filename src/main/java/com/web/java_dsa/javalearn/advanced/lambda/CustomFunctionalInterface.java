package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.function.Consumer;

@FunctionalInterface
interface StringProcess{
    String process(String text);
}

public class CustomFunctionalInterface {
    public static void main(String[] args) {
        //uppercase
        //lowercase
        //reverse
        //remove spaces

        // Predicate<T> -> boolean
        // Consumer<T> -> String
        // Supplier<> -> print
        // Function<T,R> -> R type

        // uppercase
        StringProcess uppercase = String::toUpperCase;
        System.out.println(uppercase.process("apple"));
        StringProcess lowercase = String::toLowerCase;
        System.out.println(lowercase.process("PEAR"));
        StringProcess reverse = x-> new StringBuilder(x).reverse().toString();
        System.out.println(reverse.process("Banana"));
        StringProcess removeSpaces = text -> text.replace(" ", "");
        System.out.println(removeSpaces.process("Pe ach"));
    }
}
