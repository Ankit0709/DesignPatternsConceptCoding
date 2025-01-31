package com.creational.patterns.abstractFactoryPattern;

import com.creational.patterns.abstractFactoryPattern.model.Car;

public interface AbstractCarFactory {
        Car getCarInstance(Integer price);
  }
