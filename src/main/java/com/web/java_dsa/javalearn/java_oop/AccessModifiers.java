package com.web.java_dsa.javalearn.java_oop;

public class AccessModifiers {
    int a = 1; // default
    public int b = 2;
    private int c = 3;
    protected int  d = 4;

    public static void main(String[] args) {
        AccessModifiers modifiers = new AccessModifiers();
        modifiers.a=5;
        modifiers.b=6;
        modifiers.c=7;
        modifiers.d=8;
        // private bo'lsa shu klass ni o'zida chaqirib bo'ladi.Boshqa classga chaqirib bo'lmaydi private bilsn
        // e'lon qilinsa
    }
}
