package com.qa;

public class Rectangle extends Shape{

    private double height;
    private double width;

    public Rectangle(String name, String colour, double x, double y, double height, double width) {
        super(name, colour, x, y);
        this.height = height;
        this.width = width;
    }

    public boolean isSquare(){
        if(this.height==this.width){
            return true;
        }
        return false;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.height*this.width;
    }

    @Override
    public Point getCenterPoint() {
        Point centerPoint  = new Point();
        centerPoint.setX(this.getX()+width/2);
        centerPoint.setY(this.getY()+height/2);
        return centerPoint;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
