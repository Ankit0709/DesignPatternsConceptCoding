package com.behavioural.patterns.statePattern;

public class VendingMachine {

    VendingState machineState;

    public VendingMachine(VendingState machineState) {
        this.machineState = machineState;
    }

    public void setMachineState(VendingState machineState){
        this.machineState = machineState;
    }
}
