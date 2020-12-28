package com.kaikenov.spring.mvc;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    private String name;
    private String surname;
    private String salary;
    private String department;
    private Map<String, String> departments;

    public Employee() {
        this.departments = new HashMap<>();
        this.departments.put("IT", "Information Technology");
        this.departments.put("HR", "Human Resources");
        this.departments.put("Sales", "Sales");
    }

    public Employee(String name, String surname, String salary, String department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary='" + salary + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
