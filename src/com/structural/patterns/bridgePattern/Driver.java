package com.structural.patterns.bridgePattern;

public class Driver {
    public static void main(String[] args) {
        LivingBeing fish = new Fish(new WaterBreatheProcess());
        fish.breathe();;


        LivingBeing dog = new Dog(new LandBreatheProcess());
        dog.breathe();
    }
}
