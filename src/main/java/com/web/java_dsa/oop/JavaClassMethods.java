package com.web.java_dsa.oop;

public class JavaClassMethods {
    static void display(){
        System.out.println("Java is popular and powerful programming language!");
    }
    public int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        display();
        JavaClassMethods methods = new JavaClassMethods();
        System.out.println(methods.add(5,6)); // Access method with a Object

    }
}
