package com.creational.patterns.factoryPattern.model;

import java.util.List;

public abstract class Pizza {
    String orderId;
    List<String> addOns;

    public Pizza() {
    }

    public Pizza(String orderId, List<String> addOns) {
        this.orderId = orderId;
        this.addOns = addOns;
    }

    public abstract void prepare();
 }
