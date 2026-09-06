package com.web.java_dsa.javalearn.advanced.optional;

import java.util.Optional;

public class Employee {
    private Adress adress;

    public Employee(Adress adress){
        this.adress=adress;
    }

    public Adress getAdress() {
        return adress;
    }

    public static Employee getFromServer(){
        return new Employee(new Adress(new City("Tashkent")));
    }

    public static void main(String[] args) {
       Employee employee = getFromServer();

       String cityName = Optional.of(employee)
               .map(Employee::getAdress)
               .flatMap(Adress::getCity)
               .map(City::getCityName)
               .orElse("City name is null");

        System.out.println(cityName);
    }
}
