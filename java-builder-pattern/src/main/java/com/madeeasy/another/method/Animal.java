package com.madeeasy.another.method;

public class Animal {
    private String name;
    private Integer age;

    private Animal() {}

    public static class Builder {
        private String name;
        private Integer age;
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder age(Integer age) {
            this.age = age;
            return this;
        }
        public Animal build() {
            Animal animal = new Animal();
            animal.name = this.name;
            animal.age = this.age;
            return animal;
        }
    }
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
