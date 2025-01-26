package com.creational.patterns.builderPattern;

public class CarBuilder {
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

    //setters without set prefix
    public void id(String id){
        this.id = id;
    }

    public void model(String model) {
        this.model = model;
    }

    public void company(String company){
        this.company = company;
    }

    public void year(String year) {
        this.year = year;
    }

    public void color(String color) {
        this.color = color;
    }

    public void length(String length) {
        this.length = length;
    }

    public void width(String width) {
        this.width = width;
    }

    public void height(String height) {
        this.height = height;
    }

    public void noOfGears(Integer noOfGears) {
        this.noOfGears = noOfGears;
    }

    public void bootSpace(Integer bootSpace) {
        this.bootSpace = bootSpace;
    }

    public void rearAcVents(boolean rearAcVents) {
        this.rearAcVents = rearAcVents;
    }

    //method to construct the car object and return
    public Car build(){
        return  new Car(id,model,company,year,color,length,width,height,noOfGears,bootSpace,rearAcVents);
    }
}
