package com.structural.patterns.proxyPattern;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDao employeeDao;

    public EmployeeDaoProxy(){
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void getEmployeeDetails(){
        String roles = "ADMIN";
        if(roles.equalsIgnoreCase("ADMIN")){
            employeeDao.getEmployeeDetails();
        }else{
            throw new RuntimeException();
        }
    }

}
