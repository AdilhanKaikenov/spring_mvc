package com.kaikenov.spring.mvc;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    private String name;
    private String surname;
    private String salary;
    private String department;
    private Map<String, String> departments;
    public String carBrand;
    private Map<String, String> carBrands;

    public Employee() {
        this.departments = new HashMap<>();
        this.departments.put("IT", "Information Technology");
        this.departments.put("HR", "Human Resources");
        this.departments.put("Sales", "Sales");

        this.carBrands = new HashMap<>();
        this.carBrands.put("BMW", "BMW");
        this.carBrands.put("Audi", "Audi");
        this.carBrands.put("Mercedes-Benz", "Mercedes-Benz");
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

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary='" + salary + '\'' +
                ", department='" + department + '\'' +
                ", carBrand='" + carBrand + '\'' +
                '}';
    }
}
