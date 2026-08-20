package com.web.java_dsa.javalearn.java_methods;

public class ReturnValue {
    static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int res = add(a,b);
        System.out.println(res);
    }
}
