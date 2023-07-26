package com.qa;

public class Main {
    public static void main(String[] args) {
        Circle c0 = new Circle("Circle0", "Blue", 0, 0, 10);
        Circle c1 = new Circle("Circle1", "Gray", 12, 12, 20);

        System.out.println(c0);
        System.out.println(c1);
        System.out.println("Location of circle 0 before moving: " + c0.getCurrentLocation());

        c0.move(10,2);

        System.out.println("Location of circle 0 after moving: " + c0.getCurrentLocation());


    }
}
