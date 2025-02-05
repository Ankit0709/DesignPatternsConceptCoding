package com.behavioural.patterns.strategyPattern;

public class Driver {
    public static void main(String[] args) {
        Double billAmount = 500.0;
        ShoppingCart shoppingCart = new ShoppingCart(new UPIPayStrategy());
        shoppingCart.payBillAmount(billAmount);

    }
}
