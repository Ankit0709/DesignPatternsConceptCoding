package com.behavioural.patterns.chainOfResponsibility;

public class InfoLogProcessor extends LogProcessor{

    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void logMessage(String message) {
        //if Request can be logged then success else pass to parent for next log processing
        if(message.contains("INFO")){
            System.out.println("Info  Message "+message);
        }else{
            super.logMessage(message);
        }
    }

}
