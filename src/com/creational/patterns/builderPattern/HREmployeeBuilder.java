package com.creational.patterns.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class HREmployeeBuilder extends EmployeeBuilder{
    @Override
    public EmployeeBuilder reportingManagers() {
        List<String> reportingManagers = new ArrayList<>();
        reportingManagers.add("Rohit Verma");
        this.reportingManagers = reportingManagers;
        return this;
    }
}
