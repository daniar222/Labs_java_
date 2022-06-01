package com.JavaLessons.Lab10;

abstract public class Employee {
    protected String name , post ;
    protected int salary;
    Employee(String name, String post , int salary){
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

    abstract int calc_salary();
}
