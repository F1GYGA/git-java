package com.qa;

public class Circle extends Shape{

   private double radius;

    public Circle(String name, String colour, double x, double y, double radius) {
        super(name, colour, x, y);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*this.radius;
    }

    @Override
    public Point getCenterPoint() {
        Point centerPoint = new Point();
        centerPoint.setY(this.getY());
        centerPoint.setX(this.getX());
        return centerPoint;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
