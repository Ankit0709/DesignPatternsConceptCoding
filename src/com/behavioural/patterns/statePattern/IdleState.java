package com.behavioural.patterns.statePattern;

public class IdleState implements VendingState{
    @Override
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Inserted coin in machine");
        vendingMachine.setMachineState(new WorkingState());

    }

    @Override
    public void disperseItems(VendingMachine vendingMachine) {

    }
}
