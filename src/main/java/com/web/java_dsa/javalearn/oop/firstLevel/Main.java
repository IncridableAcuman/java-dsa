package com.web.java_dsa.javalearn.oop.firstLevel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Bank Account
        /*BankAccount account = new BankAccount("qwerty123","Anvar",2005.5);
        account.deposit(200.5);
        System.out.println(account.getBalance());
        account.withDraw(1000.1);
        System.out.println(account.getBalance());
        System.out.println(account);*/
        // Student
        /*
        // student
        List<Student> students = new ArrayList<>();
        students.add( new Student("Izzatbek","Abdusharipov",22,"Telecommunication",4.42));
        students.add( new Student("Izzatbek","Abdusharipov",22,"Telecommunication",4.42));
        students.add( new Student("Izzatbek","Abdusharipov",22,"Telecommunication",4.42));

        students
                .stream()
                .map(Student::display)
                .forEach(System.out::println);

         */
        // Product
        /*
        // product
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Apple",1,10));
        products.add(new Product(2,"Orange",2,20));
        products.add(new Product(3,"Banana",3,30));

        products
                .stream()
                .map(Product::toString)
                .forEach(System.out::println);

       double totalValue = products
               .stream().mapToDouble(Product::getTotalValue).sum();

        System.out.println("Total value: " + totalValue);

        // add stock
        products
                .stream()
                .filter(product -> product.getId() == 1)
                .findFirst()
                .ifPresent(product -> product.addStock(2));

        // sell stock
        products
                .stream()
                .filter(product -> product.getName().equals("Apple"))
                .findFirst()
                .ifPresent(product -> product.sellStock(3));
        // set price
        products
                .stream()
                .filter(product -> product.getId() == 2)
                .findFirst()
                .ifPresent(product -> product.setPrice(25));

        products
                .forEach(System.out::println);

         */
        // Rectangle
        /*
        // Rectangle
        Rectangle rectangle = new Rectangle(5,5);
        int area = rectangle.getArea();
        System.out.println("Area: " + area);
        int perimeter = rectangle.getPerimeter();
        System.out.println("Perimeter: " + perimeter);
        boolean isSquare = rectangle.isSquare();
        System.out.println("Is square: " + isSquare);

         */
        // Employee
        /*
        // Employee
        Employee employee = new Employee(1,"Izzatbek",500000,"Software Engineer");
        String increatedSalary = employee.increaseSalary(25);
        System.out.println(increatedSalary);
        System.out.println(employee.toString());

         */
        // Counter
        /*
        Counter counter = new Counter(4);
        System.out.println(counter.getValue());
        System.out.println(counter.decrement());
        System.out.println(counter.increment());
        counter.reset();
        System.out.println(counter.increment());
        System.out.println(counter.getValue());

         */
        // Book
       /* Book book = new Book("Deep Work","Newport","qwr34",340);
        System.out.print(book.about());

        */
        /*
        // Car
        Car car = new Car("Chevrolet","Malibu",2026,6);
        car.drive(3);
        car.start();
        car.drive(3);
        car.refuel(45000);
        car.stop();
        car.drive(4);
         */

        /*
        // Temperature
        Temperature temperature = new Temperature(20);
        temperature.decrease();
        temperature.increase();
        System.out.println("Celsius: " + temperature.getTemp());
        double toFahrenheit = temperature.toFahrenheit(34.5);
        System.out.println("Fahrenheit: " + toFahrenheit);
        double toKelvin = temperature.toKelvin(10);
        System.out.println("Kelvin: " + toKelvin);
         */
    }
}
