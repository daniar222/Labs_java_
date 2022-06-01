package com.JavaLessons.Lab11;

public class FTEmployee implements Employee_interface {
    private int prime ;
    private String name;
    private String post;
    private int salary;
    FTEmployee(String name, String post, int salary ,int prime){
        this.name = name;
        this.post = post;
        this.salary = salary;
        this.prime = prime ;
    }
    public int calc_salary(){
        return prime + salary ;
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

    public int getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }
}
