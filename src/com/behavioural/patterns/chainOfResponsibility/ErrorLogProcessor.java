package com.behavioural.patterns.chainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor{

    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void logMessage(String message) {
        if(message.contains("ERROR")){
            System.out.println("Error Message "+message);
        }else{
            super.logMessage(message);
        }
    }
}
