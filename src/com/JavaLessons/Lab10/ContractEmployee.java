package com.JavaLessons.Lab10;

public class ContractEmployee extends Employee{
    public ContractEmployee(String name, String post, int salary){
        super(name,post,salary);
    }
    public int calc_salary(){
        return salary;
    }
    private String name;
    private String post;
    private int salary;

}
