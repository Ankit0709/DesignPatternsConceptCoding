package com.structural.patterns.adapterPattern;

public class WeightConvertAdapterImpl implements WeightConvertAdapater{
    WeightMachine weightMachine;

    WeightConvertAdapterImpl(){
        this.weightMachine = new WeightMachineImpl();
    }

    @Override
    public int convertWeightInKg() {
        return weightMachine.returnWeight() + 45;
    }
}
