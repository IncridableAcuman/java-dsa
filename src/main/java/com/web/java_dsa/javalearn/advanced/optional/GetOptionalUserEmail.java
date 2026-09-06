package com.web.java_dsa.javalearn.advanced.optional;

import java.util.Optional;

public class GetOptionalUserEmail {
    public static void main(String[] args) {
        // 5. Optional<User> berilgan. User mavjud bo‘lsa uning emailini qaytaring.
        Optional<User> optional = Optional.of(new User("Izzatbek","abs@gmail.com",21));
        optional
                .ifPresent(user -> System.out.println(user.getEmail()));
    }
}
