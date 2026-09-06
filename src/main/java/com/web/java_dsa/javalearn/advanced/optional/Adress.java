package com.web.java_dsa.javalearn.advanced.optional;

import java.util.Optional;

public class Adress {
    private City city;
    public Adress(City city){
        this.city=city;
    }

    public Optional<City> getCity() {
        return Optional.ofNullable(city);
    }
}
