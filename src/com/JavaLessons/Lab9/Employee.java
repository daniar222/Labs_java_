package com.JavaLessons.Lab9;

public class Employee {
    protected String name;
    protected String post;
    protected int salary;

    public Employee(String name, String post, int salary){
        this.name = name;
        this.post = post;
        this.salary = salary;
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

    public void calc_salary(){
        System.out.println("Расчитывается зарплата...");
        System.out.println("Зарплата сотрудника '" + name + "' :" + salary);
    }
}
