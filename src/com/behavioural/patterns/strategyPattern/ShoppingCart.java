package com.behavioural.patterns.strategyPattern;

public class ShoppingCart {

    PayStrategy payStrategy;

    public ShoppingCart(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void payBillAmount(Double amount){
        payStrategy.payBillAmount(amount);
    }
}
