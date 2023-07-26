package com.qa.model;

public class Cat extends Animal {


    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Hello from  cat : " + this.getName();
    }

    @Override
    public String move() {
        return "This cat is moving: " + this.getName();
    }

    @Override
    public String toString() {
        return "Cat " +  super.toString();
    }
}
