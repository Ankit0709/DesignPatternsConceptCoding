package com.creational.patterns.builderPattern;

public class Driver {
    public static void main(String[] args) {
        Director director1=new Director(new HREmployeeBuilder());
        Employee hrEmployee = director1.createEmployee();


        Director director2=new Director(new ITEmployeeBuilder());
        Employee itEmployee = director2.createEmployee();




    }
}
