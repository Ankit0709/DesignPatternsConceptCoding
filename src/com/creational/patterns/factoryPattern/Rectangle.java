package com.creational.patterns.factoryPattern;

public class Rectangle implements Shape{
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public int calculateArea() {
        return length*breadth;
    }
}
