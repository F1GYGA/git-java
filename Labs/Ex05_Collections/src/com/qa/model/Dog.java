package com.qa.model;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Hello from  dog : " + this.getName();
    }

    @Override
    public String move() {
        return "This dog is moving: " + this.getName();
    }
}
