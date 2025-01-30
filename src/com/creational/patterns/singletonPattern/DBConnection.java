package com.creational.patterns.singletonPattern;

public class DBConnection {

    private static volatile DBConnection instance;

    //constructor private
    private DBConnection(){

    }
    //public getter to return the instance variable
    public static DBConnection getInstance(){
        DBConnection dbInstance = instance;
      if(dbInstance == null){
          synchronized (DBConnection.class){
              if(dbInstance==null){
                  instance = new DBConnection();
              }
              return dbInstance;
          }
      }
      return dbInstance;
    }
}
