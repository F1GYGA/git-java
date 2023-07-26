package com.qa;

public interface Movable {
    public abstract Point getCurrentLocation();
    public abstract void move(double x, double y);
}
