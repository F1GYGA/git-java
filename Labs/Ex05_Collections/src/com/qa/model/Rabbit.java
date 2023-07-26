package com.qa.model;

public class Rabbit extends Animal{
    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Hello from  rabbit : " + this.getName();    }

    @Override
    public String move() {
        return "This rabbit is moving: " + this.getName();
    }
}
