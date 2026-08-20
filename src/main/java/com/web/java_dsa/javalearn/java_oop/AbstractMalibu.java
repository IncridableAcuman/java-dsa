package com.web.java_dsa.javalearn.java_oop;

public class AbstractMalibu extends AbstractCar{
    @Override
    public void speed(int speed,String model){
        System.out.println("Speed: " + speed + "\n" + "Model: " + model);
    }

    public static void main(String[] args) {
        AbstractMalibu malibu = new AbstractMalibu();
        malibu.speed(300,"Malibu 3x");
    }
}
