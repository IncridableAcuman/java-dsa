package com.web.java_dsa.javalearn.advanced.exceptionHandling;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}
