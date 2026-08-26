package com.web.java_dsa.javalearn.advanced.thread;

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            System.out.println("Task started");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            System.out.println("Task finished");
        });
        thread.start();

        thread.join();

        System.out.println("Main finished");
    }
}
