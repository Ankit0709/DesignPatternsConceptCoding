package com.behavioural.patterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class ObservableClassImpl implements Observable {
    List<Observer> observerList;
    private Integer data;
    ObservableClassImpl(){
        observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObjects() {
        for(Observer observer:observerList){
            observer.sendNotification();
        }
    }

    @Override
    public void setData(Integer updateData) {
        data = updateData;
        notifyObjects();
    }
}
