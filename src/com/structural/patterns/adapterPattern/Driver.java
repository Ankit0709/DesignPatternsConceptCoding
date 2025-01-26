package com.structural.patterns.adapterPattern;

public class Driver {
    public static void main(String[] args) {
       WeightConvertAdapater weightConvertAdapater  = new WeightConvertAdapterImpl();
       System.out.println(weightConvertAdapater.convertWeightInKg());
    }
}
