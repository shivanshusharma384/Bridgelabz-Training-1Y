package com.gla.Package.EmployeeManagement;

import com.gla.Package.EmployeeManagement.Employee;

public class Payroll {
    public double calculateBonus(Employee e){
        return e.getSalary() * 1.10;
    }
}
