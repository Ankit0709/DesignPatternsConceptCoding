package com.behavioural.patterns.strategyPattern;

public interface PayStrategy {
     double calculateCharges();
     double payBillAmount(Double amount);
}
