package com.structural.patterns.facadePattern;

public class Driver {
    public static void main(String[] args) {

        //Get a AC and turn on the ac
        AcFacadeSystem acFacadeSystem = new AcFacadeSystem();
        acFacadeSystem.switchOnAC();
    }
}
