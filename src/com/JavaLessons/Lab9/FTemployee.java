package com.JavaLessons.Lab9;

public class FTemployee extends Employee{
    private int premium;
    public FTemployee(String name, String post, int salary,int premium){
        super(name,post,salary);
        this.premium = premium;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    public void Calc_salary(){

        System.out.println("Зарплата сотрудника '" + super.getName() + "': " + super.getSalary() + "+" + premium + "=" + (super.getSalary() + premium) );
    }

}
