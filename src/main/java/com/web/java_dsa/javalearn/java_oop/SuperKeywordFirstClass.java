package com.web.java_dsa.javalearn.java_oop;

public class SuperKeywordFirstClass {
    private int a;
    private int b;
    public int getA(){
        return a;
    }
    public void setA(int a){
        this.a=a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void display(){
        System.out.println("a=" + a + "\nb=" + b);
    }
    public SuperKeywordFirstClass(int a,int b){
        this.a=a;
        this.b=b;
    }
}
