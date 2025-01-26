package com.behavioural.patterns.templatePattern;

public class BattleOfFieldGameLoader extends BaseGameLoader{
    @Override
    public byte[] loadGameInMemory() {
        System.out.println("Loading battle of field game ");
        return new byte[0];
    }

    @Override
    public void createObjectsInGame(byte[] data) {
        System.out.println("Creating battle of field game ");

    }

    @Override
    public void downloadMusicAndVideos() {
        System.out.println("Downloading music and videos for  battle of field game ");

    }

    @Override
    public void downloadingProfiles() {
        System.out.println("Downloading profiles for  battle of field game ");

    }
}
