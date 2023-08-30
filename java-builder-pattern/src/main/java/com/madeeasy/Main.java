package com.madeeasy;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student()
                .setId(1)
                .setName(" Ram & quot")
                .setAddress(" Noida & quot");
        Student student2 = new Student()
                .setId(2)
                .setName(" Shyam & quot")
                .setAddress(" Delhi & quot");

        System.out.println(student1);
        System.out.println(student2);
    }
}