package com.JavaLessons.Lab8b;

import java.util.ArrayList;

public class Firm {
    private String Firm_name ;
    public String getFirm_name() {
        return Firm_name;
    }
    public void setFirm_name(String firm_name) {
        Firm_name = firm_name;
    }

    private ArrayList departments_list = new ArrayList();
    public ArrayList getDepartments_list(){
        return departments_list;
    }
    public void Add_departments_list(Department department){
        departments_list.add(department);
    }
    public void Remove_department_list(Department department){
        departments_list.remove(department);
    }



}
