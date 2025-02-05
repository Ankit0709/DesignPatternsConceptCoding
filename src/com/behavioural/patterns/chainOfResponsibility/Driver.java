package com.behavioural.patterns.chainOfResponsibility;

public class Driver {
    public static void main(String[] args) {

        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.logMessage("DEBUG Message !");
    }
}
