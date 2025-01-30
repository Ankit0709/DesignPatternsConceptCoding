package com.creational.patterns.factoryPattern;

public class RectangleShapeFactory extends ShapeFactory{
    @Override
    public Shape createShape() {
        Shape rectangleShape = new Rectangle(10,20);
        return rectangleShape;
    }
}
