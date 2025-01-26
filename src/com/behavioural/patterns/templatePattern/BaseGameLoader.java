package com.behavioural.patterns.templatePattern;

public abstract class BaseGameLoader {

    public void load(){
        byte[] data = loadGameInMemory();
        createObjectsInGame(data);
        downloadMusicAndVideos();
        cleaningSpace();
        downloadingProfiles();
    }

    public abstract byte[] loadGameInMemory() ;
    public abstract  void createObjectsInGame(byte[] data);
    public abstract  void downloadMusicAndVideos();
    protected   void cleaningSpace(){
        System.out.println("Clearing space for the game ......");
    }
    public abstract  void downloadingProfiles();

}
