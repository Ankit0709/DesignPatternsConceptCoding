package com.creational.patterns.builderPattern;

import java.util.List;

public class Employee {
    private int employeeId;
    private String name;
    private Integer age;
    private String gender;
    private String email;
    private String department;
    private List<String> reportingManagers;

    public Employee(EmployeeBuilder employeeBuilder) {
        this.employeeId = employeeBuilder.employeeId;
        this.name = employeeBuilder.name;
        this.age = employeeBuilder.age;
        this.gender = employeeBuilder.gender;
        this.email = employeeBuilder.email;
        this.department = employeeBuilder.department;
        this.reportingManagers = employeeBuilder.reportingManagers;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", reportingManagers=" + reportingManagers +
                '}';
    }
}
