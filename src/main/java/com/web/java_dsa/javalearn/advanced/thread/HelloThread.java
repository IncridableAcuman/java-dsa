package com.web.java_dsa.javalearn.advanced.thread;

public class HelloThread extends Thread{
    @Override
    public void run(){
        System.out.println("Hello thread");
    }

    public static void main(String[] args) {
        HelloThread thread = new HelloThread();
        thread.start();
    }
}
