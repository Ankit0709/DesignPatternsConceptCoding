package com.creational.patterns.builderPattern;

public class Director {
    EmployeeBuilder employeeBuilder;

    public Director(EmployeeBuilder employeeBuilder) {
        this.employeeBuilder = employeeBuilder;
    }

    public Employee createEmployee(){
        if (employeeBuilder instanceof HREmployeeBuilder){
            return createHREmployee();
        }else if (employeeBuilder instanceof ITEmployeeBuilder){
            return createITEmployee();
        }
        return null;
    }
    private Employee createITEmployee(){
        return employeeBuilder.employeeId(1).age(23).department("IT").build();
    }
    private Employee createHREmployee(){
        return employeeBuilder.employeeId(2).age(26).department("HR").gender("Female").build();
    }

}
