package com.behavioural.patterns.commandPattern;

import java.util.List;

public class House {
    List<Room> rooms;

    House(List<Room> rooms){
        this.rooms = rooms;
    }
    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(Room room){
        rooms.add(room);
    }
}
