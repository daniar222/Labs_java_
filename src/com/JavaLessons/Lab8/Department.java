package com.JavaLessons.Lab8;
import java.util.ArrayList;

public class Department {

    private String name_department;
    public String getName_department() {
        return name_department;
    }
    public void setName_department(String name_department) {
        this.name_department = name_department;
    }


    private ArrayList employees = new ArrayList();

    public ArrayList getEmployees() {
        return employees;
    }
    public void addEmployees(Employee employee) {
        employees.add(employee);
    }
    public void removeEmployees(Employee employee){
        employees.remove(employee);
    }
    // соответствие фирме//////////////
    Firm firm = new Firm();

    public Firm getFirm() {
        return firm;
    }
    public void setFirm(Firm firm) {
        this.firm = firm;
    }
    ///////////////////////////////////


    private Employee employee;
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
