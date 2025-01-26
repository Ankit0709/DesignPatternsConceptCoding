package com.behavioural.patterns.commandPattern;

public abstract class Room {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void switchLights(){
        System.out.println("Lights switch on/off !");
        command.execute();
    }
}
