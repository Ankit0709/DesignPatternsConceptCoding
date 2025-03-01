package com.behavioural.patterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

public interface Observable {

     void addObserver(Observer observer);
     void removeObserver(Observer observer);
     void notifyObjects();
     void setData(Integer updateData);

}
