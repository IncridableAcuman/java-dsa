package com.web.java_dsa.javalearn.oop.firstLevel;

public class Counter {
    private int value;

    public Counter(int value){
        this.value=value;
    }

    public int increment(){
       return value++;
    }
    public int decrement(){
        return value--;
    }
    public void reset(){
        value=0;
    }
    public int getValue(){
        return value;
    }

    public static void main(String[] args) {
        // 7. Counter
        //
        //Counter klassini yarating.
        //
        //increment()
        //decrement()
        //reset()
        //getValue()
        //
        //Counter qiymati 0 dan pastga tushmasin.
    }
}
