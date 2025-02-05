package com.behavioural.patterns.strategyPattern;

public class UPIPayStrategy implements PayStrategy{
    @Override
    public double calculateCharges() {
        return 5;
    }

    @Override
    public double payBillAmount(Double amount) {
        return amount+calculateCharges();
    }
}
