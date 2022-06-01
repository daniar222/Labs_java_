package com.JavaLessons.Lab10;

public class Department {
    private String name;
    private int numb_employees;
    public Department(String name, int numb_employees){
        this.name = name;
        this.numb_employees = numb_employees;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumb_employees() {
        return numb_employees;
    }

    public void setNumb_employees(int numb_employees) {
        this.numb_employees = numb_employees;
    }
}
