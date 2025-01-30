package com.creational.patterns.factoryPattern;

public class SquareShapeFactory extends ShapeFactory{
    @Override
    public Shape createShape() {
        Shape squareShape = new Square(10);
        return squareShape;
    }
}
