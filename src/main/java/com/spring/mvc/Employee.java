package com.spring.mvc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    private String name;
    private String surname;
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String employment;
    private Map<String, String> employments;
    private String[] languages;
    private Map<String, String> langMap;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Human Resources", "HR");
        departments.put("Sales", "Sales");

        employments = new HashMap<>();
        employments.put("Offline", "Offline");
        employments.put("Online", "Online");
        employments.put("Freelancer", "Freelancer");

        langMap = new HashMap<>();
        langMap.put("English", "EN");
        langMap.put("Deutsch", "DE");
        langMap.put("Ukrainian", "UA");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public Map<String, String> getEmployments() {
        return employments;
    }

    public void setEmployments(Map<String, String> employments) {
        this.employments = employments;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLangMap() {
        return langMap;
    }

    public void setLangMap(Map<String, String> langMap) {
        this.langMap = langMap;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", employment='" + employment + '\'' +
                ", languages=" + Arrays.toString(languages) +
                '}';
    }
}
