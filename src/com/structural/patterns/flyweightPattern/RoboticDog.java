package com.structural.patterns.flyweightPattern;

public class RoboticDog implements Robot{
    //Intrinsic Data
    String type;
    Object body;

    public void setType(String type) {
        this.type = type;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    //Extrinsic Data
    @Override
    public void display(int x, int y) {

    }
}
