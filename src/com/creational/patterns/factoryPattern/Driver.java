package com.creational.patterns.factoryPattern;

public class Driver {
    public static void main(String[] args) {
        ShapeFactory circleShapeFactory = new CircleShapeFactory();
        int shapeArea = circleShapeFactory.calculateCreatedShapeArea();
        System.out.println(shapeArea);

    }
}
