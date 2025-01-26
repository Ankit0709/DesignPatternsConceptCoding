package com.behavioural.patterns.chainOfResponsibility;

public abstract class Handler {

    Handler handler;

    public void setHandler(Handler handler){

    }

    public abstract  void handle();


}
