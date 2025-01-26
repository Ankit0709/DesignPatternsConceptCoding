package com.creational.patterns.singletonPattern;

public class DriverClass {
    public static void main(String[] args) {
        SingletonClass singletonObject1 = SingletonClass.getInstance("Get My First Singleton Object !!");
        SingletonClass singletonObject2 = SingletonClass.getInstance("Get My Second Singleton Object !!");
        System.out.println(singletonObject1.printMessage());
        System.out.println(singletonObject2.printMessage());

    }
}
