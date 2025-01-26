package com.creational.patterns.prototypePattern;

public class Bus extends Vehicle{
     int doors;

    Bus(){

    }
    public Bus(Bus bus) {
        super(bus);
        this.doors = bus.doors;
    }
    @Override
    public Vehicle clone() {
        return new Bus(this);
    }
}
