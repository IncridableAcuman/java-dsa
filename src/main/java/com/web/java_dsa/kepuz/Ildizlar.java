package com.web.java_dsa.kepuz;

public class Ildizlar {
    public static void main(String[] args) {
        int a = -10,b = 15, c = 421;
        int sqrt = (int) Math.sqrt(Math.pow(b,2)-(4*a*c));
        int x1 =  ((-b)+sqrt)/(2*a);
        int x2 = ((-b)-sqrt)/(2*a);
        System.out.println(Math.abs(x1+x2));
    }
}
