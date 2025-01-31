package com.creational.patterns.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class ITEmployeeBuilder extends EmployeeBuilder{
    @Override
    public EmployeeBuilder reportingManagers() {
        List<String> reportingManagers = new ArrayList<>();
        reportingManagers.add("Vipul Sharma");
        this.reportingManagers = reportingManagers;
        return this;
    }
}
