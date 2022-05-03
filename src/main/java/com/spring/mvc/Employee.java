package com.spring.mvc;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Employee {
    @NotBlank(message = "Name field must not be empty")
    @Size(min = 2, message = "Name must be greater 2 symbols")
    private String name;

    @NotBlank(message = "Surname field must not be empty")
    @Size(min = 2, message = "Surname must be greater 2 symbols")
    private String surname;

    @Min(value = 500, message = "Salary must be greater 500$")
    @Max(value = 2000, message = "Salary must be less 2000$")
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
