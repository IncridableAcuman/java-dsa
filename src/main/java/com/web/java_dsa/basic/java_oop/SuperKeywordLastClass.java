package com.web.java_dsa.basic.java_oop;

public class SuperKeywordLastClass extends SuperKeywordFirstClass{
    public SuperKeywordLastClass(int a, int b) {
        super(a, b);
    }
    @Override
    public void display(){
        super.display();
    }

    public static void main(String[] args) {
        SuperKeywordLastClass lastClass = new SuperKeywordLastClass(1,2);
        lastClass.display();
    }
}
