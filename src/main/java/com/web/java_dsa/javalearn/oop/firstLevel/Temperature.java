package com.web.java_dsa.javalearn.oop.firstLevel;

public class Temperature {
    private double temp;

    public Temperature(double temp){
        this.temp=temp;
    }

    public double getTemp() {
        return temp;
    }

    public void increase(){
        temp++;
    }

    public void decrease(){
        temp--;
    }

    public double toFahrenheit(double temp){
        return (1.8 * temp) + 32;
    }
    public double toKelvin(double temp){
        return 273.15 + temp;
    }

    public static void main(String[] args) {
        //      6. Temperature
        //
        //Temperature klassini yarating.
        //
        //Ichkarida harorat Celsius ko‘rinishida saqlansin.
        //
        //Metodlar:
        //
        //toFahrenheit()
        //toKelvin()
        //increase()
        //decrease()
    }
}
