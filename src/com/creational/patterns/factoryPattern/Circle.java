package com.creational.patterns.factoryPattern;

public class Circle implements  Shape{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int calculateArea() {
        return (int) (3.14*radius*radius);
    }
}
