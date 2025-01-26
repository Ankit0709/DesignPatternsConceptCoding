package com.creational.patterns.singletonPattern;

public class SingletonClass {
    private static  volatile SingletonClass instance;
    private String message;

    //This would not allow other classes to instatiate the class
    private SingletonClass(String message){
        this.message = message;
    }

    /*getting the instance of the class this would work fine for single threaded environment but non in multiple threads
    So in order to make it thread safe we use synchronized block but every time it won't allow two threads so we use double
    checking mechanism to prevent other threads to wait once object is instatinated. Make it fast
    */
    public static SingletonClass getInstance(String message){
        SingletonClass object = instance;
        if(object == null){
            synchronized (SingletonClass.class){
                if(object == null){
                    object = new SingletonClass(message);
                }
            }
        }
        return object;
    }

    public String printMessage(){
        return message;
    }
}
