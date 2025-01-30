package com.creational.patterns.factoryPattern;

public class CircleShapeFactory extends ShapeFactory {

    @Override
    public Shape createShape() {
        Shape circleShape = new Circle(5);
        return circleShape;
    }
}
