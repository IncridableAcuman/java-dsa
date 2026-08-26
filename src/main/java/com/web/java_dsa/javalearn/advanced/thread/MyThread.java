package com.web.java_dsa.javalearn.advanced.thread;
/*
public class MyThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()); // main
    }
}*/
/*
public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("New thread");
    }
    public static void main(String[] args) {
     MyThread thread = new MyThread();
     thread.run(); // New thread
     thread.start(); // New thread
    }
}*/
public class MyThread extends Thread{
    public static void main(String[] args) {
        Runnable task = ()-> {
            System.out.println("Running..");
        };
        Thread thread = new Thread(task);
        thread.start(); // Running..

        Thread thread1 = new Thread(()->{
            System.out.println("Again new thread");
        }); // Again new thread
        thread1.start();
    }
}
