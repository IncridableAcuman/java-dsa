package com.web.java_dsa.oop;


public class CreateClass {
    int x = 5;

    public static void main(String[] args) {
        CreateClass first = new CreateClass(); // only you can create object with new keyword
        System.out.println(first.x);
        CreateClass second = new CreateClass();
        System.out.println(second.x);
        // multiple objects
    }
}
