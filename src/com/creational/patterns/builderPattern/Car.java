package com.creational.patterns.builderPattern;

public class Car {
    private String id;
    private String model;
    private String company;
    private String year;
    private String color;
    private String length;
    private String width;
    private String height;
    private Integer noOfGears;
    private Integer bootSpace;
    private boolean rearAcVents;

    public Car(String id, String model, String company, String year, String color, String length, String width, String height, Integer noOfGears, Integer bootSpace, boolean rearAcVents) {
        this.id = id;
        this.model = model;
        this.company = company;
        this.year = year;
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
        this.noOfGears = noOfGears;
        this.bootSpace = bootSpace;
        this.rearAcVents = rearAcVents;
    }
}
