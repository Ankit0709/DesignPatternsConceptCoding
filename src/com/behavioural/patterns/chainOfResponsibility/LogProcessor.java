package com.behavioural.patterns.chainOfResponsibility;

public abstract class LogProcessor {

    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    public  void logMessage(String message){
        if(nextLogProcessor!=null){
            nextLogProcessor.logMessage(message);
        }
    }

}
