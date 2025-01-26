package com.behavioural.patterns.commandPattern;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        House house = new House(new ArrayList<>());
        Room bedRoom = new Bedroom();
        bedRoom.setCommand(
                new SwitchLightsCommand(new Light())
        );

        Room livingRoom = new LivingRoom();
        livingRoom.setCommand(
                new SwitchLightsCommand(new Light())
        );
        house.addRoom(bedRoom);
        house.addRoom(bedRoom);
        house.addRoom(livingRoom);

        house.rooms.forEach(Room::switchLights);


    }
}
