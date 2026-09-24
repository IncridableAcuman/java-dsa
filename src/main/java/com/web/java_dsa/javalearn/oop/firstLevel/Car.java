package com.web.java_dsa.javalearn.oop.firstLevel;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double fuel;
    private boolean isRunning=false;

    public Car(String brand,String model,int year,double fuel){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.fuel=fuel;
    }
    public void start(){
        if (!isRunning){
            isRunning=true;
            System.out.println(brand + " " + model + " yuritildi. Car is running...");
        } else {
            System.out.println("Mashina allaqachon o't oldirilgan.");
        }

    }
    public void stop(){
        if (isRunning){
            isRunning=false;
            System.out.println("Mashina o'chirildi. Car stopped");
        } else {
            System.out.println("Mashina allaqchon o'chiq");
        }
    }
    public void drive(double distance){
        if (!isRunning){
            System.out.println("Mashina oldin yonishi kerak.");
            return;
        }
        if (distance > 0){
            System.out.println(distance + " km masofani bosib o'tamiz.");
        } else {
            System.out.println("Masofa 0 dan katta bo'lishi kerak.");
        }
    }
    public void refuel(double amount){
        if (amount < 15000){
            System.out.println("Mablag' kam.");
        } else {
            double litr = amount / 15000.0;
            this.fuel += litr;
            System.out.println("Sizga " + litr + " listr quyildi. Umumiy yonilg'i " + fuel);
        }
    }
    public static void main(String[] args) {
        // 8. Car
        //
        //Car klassini yarating.
        //
        //brand
        //model
        //year
        //fuel
        //
        //Metodlar:
        //
        //start()
        //stop()
        //drive(distance)
        //refuel(amount)
        //
        //Mashina yoqilmagan bo‘lsa drive() ishlamasin.
    }
}
