package com.gla.Encapsulation.EmployeeManagement;

class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double fixedSalary;

    public FullTimeEmployee(int id, String name, double fixedSalary) {
        super(id, name, fixedSalary);
        this.fixedSalary = fixedSalary;
    }

    public double calculateSalary() {
        return fixedSalary;
    }

    public void assignDepartment(String dept) {
        department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }
}
