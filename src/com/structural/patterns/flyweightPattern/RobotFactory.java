package com.structural.patterns.flyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    static Map<String,Robot> robotsMap = new HashMap<>();

    public static Robot createRobot(String type) {
        if (robotsMap.containsKey(type)) {
            return robotsMap.get(type);
        }
        if (type.equalsIgnoreCase("HUMANOID")) {
            HumanoidRobot humanoidRobot = new HumanoidRobot();
            humanoidRobot.setBody(new Object());
            robotsMap.put(type, humanoidRobot);
        } else {
            RoboticDog roboticDog = new RoboticDog();
            roboticDog.setBody(new Object());
            robotsMap.put(type, roboticDog);
        }
        return null;
    }
}
