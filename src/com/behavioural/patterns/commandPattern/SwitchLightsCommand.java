package com.behavioural.patterns.commandPattern;

public class SwitchLightsCommand implements Command{
    Light light;

    public SwitchLightsCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.setLghtsSwitched();
    }
}
