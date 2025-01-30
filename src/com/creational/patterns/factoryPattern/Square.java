package com.creational.patterns.factoryPattern;

public class Square implements  Shape{
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return side*side;
    }
}
