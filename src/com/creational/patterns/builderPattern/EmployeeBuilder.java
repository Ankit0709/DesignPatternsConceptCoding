package com.creational.patterns.builderPattern;

import java.util.List;

public abstract class EmployeeBuilder {
     int employeeId;
     String name;
     Integer age;
     String gender;
     String email;
     String department;
    List<String> reportingManagers;

    public EmployeeBuilder employeeId(Integer employeeId){
        this.employeeId = employeeId;
        return this;
    }

    public EmployeeBuilder name(String name){
        this.name = name;
        return  this;
    }

    public EmployeeBuilder age(Integer age){
        this.age = age;
        return this;
    }

    public EmployeeBuilder gender(String gender){
        this.gender = gender;
        return  this;
    }
    public EmployeeBuilder email(String email){
        this.email = email;
        return  this;
    }

    public EmployeeBuilder department(String department){
        this.department = department;
        return this;
    }

    public  abstract  EmployeeBuilder reportingManagers();

    public Employee build(){
        return new Employee(this);
    }

}
