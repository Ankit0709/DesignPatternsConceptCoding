package com.creational.patterns.builderPattern;

public class Director {
    EmployeeBuilder employeeBuilder;

    public Director(EmployeeBuilder employeeBuilder) {
        this.employeeBuilder = employeeBuilder;
    }

    public Employee createEmployee(String department){
        if (department.equalsIgnoreCase("HR")){
            employeeBuilder = new HREmployeeBuilder();
            employeeBuilder.build();
        }else if (department.equalsIgnoreCase("IT")){
            employeeBuilder = new ITEmployeeBuilder();
            employeeBuilder.build();
        }
        return null;
    }
}
