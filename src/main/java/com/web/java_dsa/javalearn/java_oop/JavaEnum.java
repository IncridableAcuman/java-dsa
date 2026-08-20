package com.web.java_dsa.javalearn.java_oop;
/*
enum Level{
    LOW,MEDIUM,HIGH
}*/
// ishlaydi bunda ham

public class JavaEnum {
    enum Level{
        LOW,MEDIUM,HIGH
    }
    enum Role{
        USER("User role"),
        ADMIN("admin role");

        private String description;

        private Role(String description){
            this.description=description;
        }
        public String getDescription(){
            return description;
        }
    }

    public static void main(String[] args) {
        Level level = Level.HIGH;
        System.out.println(level);
        Role role = Role.USER;
        System.out.println(role.getDescription());
    }
}
