package com.JavaLessons.Lab8;

public class Employee {
    private String name_employee ;
    private String post_employee ;
    private int salary_employee;

    public String getName_employee() {
        return name_employee;
    }
    public void setName_employee(String name_employee) {
        this.name_employee = name_employee;
    }
    public String getPost_employee() {
        return post_employee;
    }
    public void setPost_employee(String post_employee) {
        this.post_employee = post_employee;
    }
    public int getSalary_employee() {
        return salary_employee;
    }
    public void setSalary_employee(int salary_employee) {
        this.salary_employee = salary_employee;
    }

    private Department department ;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department, Employee employee) {
        this.department = department;
        department.setEmployee(employee);
    }
}
