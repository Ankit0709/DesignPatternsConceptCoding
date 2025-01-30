package com.creational.patterns.factoryPattern;

public abstract class ShapeFactory {

    public Integer calculateCreatedShapeArea(){
        Shape shape = createShape();
        int area = shape.calculateArea();
        return area;
    }

    //factpry method
    public abstract Shape createShape();
}
