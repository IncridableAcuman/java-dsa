package com.web.java_dsa.javalearn.advanced.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GetUserOfAgeGreaterThan18 {
    public static void main(String[] args) {
        // 9. Optional<User> berilgan. Userning yoshi 18 dan kichik bo‘lsa userni qaytaring.

        List<User> users = new ArrayList<>();
        users.add(new User("user","user@gmail.com",17));
        users.add(new User("admin","admin@gmail.com",18));
        users.add(new User("olaph","alaph@gmail.com",19));
        users.add(new User("niko","niko@gmail.com",20));
        users.add(new User("ball","ball@gmail.com",21));

        Optional<User> optional = Optional.of(new User("code","code@gmail.com",17));
        optional
                .stream()
                .filter(user -> user.getAge() > 18)
                .forEach(System.out::println);
    }
}
