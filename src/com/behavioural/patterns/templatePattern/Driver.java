package com.behavioural.patterns.templatePattern;

public class Driver {
    public static void main(String[] args) {
        BaseGameLoader battleOfFeild = new BattleOfFieldGameLoader();
        battleOfFeild.load();
    }
}
