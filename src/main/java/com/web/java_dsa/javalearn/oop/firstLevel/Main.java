package com.web.java_dsa.javalearn.oop.firstLevel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*BankAccount account = new BankAccount("qwerty123","Anvar",2005.5);
        account.deposit(200.5);
        System.out.println(account.getBalance());
        account.withDraw(1000.1);
        System.out.println(account.getBalance());
        System.out.println(account);*/

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
    }
}
