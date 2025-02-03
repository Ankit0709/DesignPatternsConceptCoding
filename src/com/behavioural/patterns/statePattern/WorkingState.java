package com.behavioural.patterns.statePattern;

public class WorkingState implements VendingState{
    @Override
    public void insertCoin(VendingMachine vendingMachine) {

    }

    @Override
    public void disperseItems(VendingMachine vendingMachine) {
        System.out.println("Item is dispered!");
        //change the state according to logic
    }
}
