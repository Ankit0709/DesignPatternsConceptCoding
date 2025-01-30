package com.creational.patterns.singletonPattern;

public class Driver {
    public static void main(String[] args) {

        DBConnection connection1=DBConnection.getInstance();

        DBConnection conn2 = DBConnection.getInstance();
    }
}
