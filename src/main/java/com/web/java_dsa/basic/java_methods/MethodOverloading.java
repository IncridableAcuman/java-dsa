package com.web.java_dsa.basic.java_methods;

public class MethodOverloading {
    static int add(int a,int b){
        return a + b;
    }
    static int add(int a,int b,int c){
        return a + b + c;
    }
    static double add(double a,double b){
        return a + b;
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println("Add: " + add(a,b));
        System.out.println("Add: " + add(a,b,c));
        System.out.println("Add: " + add(1.2,2.1));
    }
}
