package com.web.java_dsa.javalearn.java_methods;

public class MethodParameters {
    static void getName(String name){
        System.out.println("My name is " + name);
    }
    static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        String name = "Izzatbek";
        getName(name);
        add(1,2);
    }
}
