package com.structural.patterns.flyweightPattern;

public class Driver {
    public static void main(String[] args) {

        Robot robot1 = new HumanoidRobot();
        robot1.display(10,20);

        Robot robot2= new HumanoidRobot();
        robot2.display(20,30);

        Robot robot3=new RoboticDog();
        robot3.display(15,20);


    }
}
