package com.madeeasy.another.method;

public class Main {
    public static void main(String[] args) {
        Animal animal = Animal.builder()
                .name("cat")
                .age(15)
                .build();
        System.out.println("animal = " + animal);
    }
}
