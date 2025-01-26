package com.structural.patterns.bridgePattern;

public abstract  class  LivingBeing {
    BreatheImplementor breatheImplementor;

    LivingBeing(BreatheImplementor breatheImplementor){
        this.breatheImplementor = breatheImplementor;
    }

     public abstract void breathe();
}
