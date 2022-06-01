package com.JavaLessons.Lab8;

import java.util.ArrayList;

public class Firm {

    private String firm_name;
    public String getFirm_name() {
        return firm_name;
    }
    public void setFirm_name(String firm_name) {
        this.firm_name = firm_name;
    }



    private ArrayList departments = new ArrayList();

    public ArrayList getDepartments(){
        return departments ;
    }
    public void addDepartments(Department department){
        departments.add(department);
    }
    public void removeDepartments(Department department){
        departments.remove(department);
    }



    private Department department ;
    public Department getDepartment(){
        return department;
    }
    public void setDepartment(Department department){
        this.department = department ;
    }

}
