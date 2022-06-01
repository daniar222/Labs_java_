package com.JavaLessons.Lab8c;

import java.util.ArrayList;

public class Department {
    private String department_name;


    public String getDepartment_name() {
        return department_name;
    }
    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }


    Firm firm = new Firm() ;
    public void setFirm(Firm firm){
        this.firm = firm;
    }
    public Firm getFirm(){
        return firm;
    }


    private ArrayList employees_list = new ArrayList();
    public ArrayList getEmployees_list(){
        return employees_list;
    }
    public void Add_employees_list(Employee employee){
        employees_list.add(employee);
    }
    public void Remove_employees_list(Employee employee){
        employees_list.add(employee);
    }


}
