package com.JavaLessons.Lab11;

public class ContractEmployee implements Employee_interface {
    private String name;
    private String post;
    private int salary;
    public ContractEmployee(String name, String post, int salary){
        this.name = name;
        this.post = post;
        this.salary = salary;
    }
    public int calc_salary(){
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
