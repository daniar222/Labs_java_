package com.JavaLessons.Lab10;

public class FTEmployee extends Employee{
    private int prime ;
    private String name;
    private String post;
    private int salary;
    FTEmployee(String name, String post, int salary ,int prime){
        super(name, post , salary);
        this.prime = prime ;
    }
    int calc_salary(){
        return prime + salary ;
    }

    public int getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }
}
