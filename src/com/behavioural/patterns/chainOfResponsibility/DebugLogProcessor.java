package com.behavioural.patterns.chainOfResponsibility;

public class DebugLogProcessor extends LogProcessor{

    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void logMessage(String message) {
        if(message.contains("DEBUG")){
            System.out.println("Debug Level log Message "+message);
        }else{
            super.logMessage(message);
        }
    }
}
