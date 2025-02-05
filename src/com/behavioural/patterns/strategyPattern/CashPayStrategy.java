package com.behavioural.patterns.strategyPattern;

public class CashPayStrategy implements PayStrategy{
    @Override
    public double calculateCharges() {
        return 0;
    }

    @Override
    public double payBillAmount(Double amount) {
        return amount+calculateCharges();
    }
}
