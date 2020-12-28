package com.kaikenov.spring.mvc;

import com.kaikenov.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 2, message = "Name must be minimum 2 symbols")
    private String name;
    @NotBlank(message = "Surname is required field")
    private String surname;
    @Min(value = 500, message = "must be greater 499")
    @Max(value = 1000, message = "must be less than 1001")
    private String salary;
    private String department;
    private Map<String, String> departments;
    public String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String, String> languageList;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail(value = "abc.com", message = "email must ends with abc.com")
    private String email;

    public Employee() {
        this.departments = new HashMap<>();
        this.departments.put("IT", "Information Technology");
        this.departments.put("HR", "Human Resources");
        this.departments.put("Sales", "Sales");

        this.carBrands = new HashMap<>();
        this.carBrands.put("BMW", "BMW");
        this.carBrands.put("Audi", "Audi");
        this.carBrands.put("Mercedes-Benz", "Mercedes-Benz");

        this.languageList = new HashMap<>();
        this.languageList.put("English", "EN");
        this.languageList.put("Russian", "RU");
        this.languageList.put("French", "FR");
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

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
