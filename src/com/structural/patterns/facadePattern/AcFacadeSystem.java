package com.structural.patterns.facadePattern;

public class AcFacadeSystem {
    private AcInternalUnit acInternalUnit;
    private AcExternalUnit acExternalUnit;

    AcFacadeSystem(){
        acExternalUnit = new AcExternalUnit();
        acInternalUnit = new AcInternalUnit();
    }

    public void switchOnAC(){
        acInternalUnit.feedUserInputsAndTemp();
        acInternalUnit.commandsExternalUnitToOperate();
        acExternalUnit.consumeNitrogen();
        acExternalUnit.powerOnSystem();
        acExternalUnit.turnOnCompressor();
    }



}
