package com.behavioural.patterns.strategyPattern;

public class CreditCardPayStrategy implements PayStrategy{
    @Override
    public double calculateCharges() {
        return 10;
    }

    @Override
    public double payBillAmount(Double amount) {
        double charges = calculateCharges();
        return amount+charges;
    }
}
