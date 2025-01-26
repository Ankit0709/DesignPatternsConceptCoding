package com.structural.patterns.proxyPattern;

public class Driver {
    public static void main(String[] args) {
        EmployeeDaoProxy employeeDaoProxy = new EmployeeDaoProxy();
        employeeDaoProxy.getEmployeeDetails();
    }
}
