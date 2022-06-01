package com.JavaLessons.Lab10;

public class TestLab10 {
    public static void main(String[] args) {
        Firm firm = new Firm("Lakers") ;
        Department department = new Department("Production", 4) ;
        ContractEmployee employee = new ContractEmployee("Ivan", "Chief" , 1200)  ;
        ContractEmployee employee1 = new ContractEmployee("Fedor", "Postman" , 300)  ;
        FTEmployee employee2 = new FTEmployee("Gleb" , "Engineer",3000 , 1200);
        FTEmployee employee3 = new FTEmployee("Aleksey" , "Driver",900 , 300);
        System.out.println("Name firm: " + firm.getName());
        System.out.println("Name department: " +department.getName());
        System.out.println("Number of employees :"+ department.getNumb_employees() + "\n");
        System.out.println("Employees :");
        System.out.println("Name :" + employee.getName());
        System.out.println("Post :" + employee.getPost());
        System.out.println("Salary :" + employee.getSalary());
        System.out.println("Calc salary: " + employee.calc_salary()+ "\n");
        System.out.println("Name :" + employee1.getName());
        System.out.println("Post :" + employee1.getPost());
        System.out.println("Salary :" + employee1.getSalary());
        System.out.println("Calc salary: " + employee1.calc_salary()+ "\n");
        System.out.println("Name :" + employee2.getName());
        System.out.println("Post :" + employee2.getPost());
        System.out.println("Salary :" + employee2.getSalary());
        System.out.println("Prime :" + employee2.getPrime());
        System.out.println("Calc salary: " + employee2.calc_salary() + "\n");
        System.out.println("Name :" + employee3.getName());
        System.out.println("Post :" + employee3.getPost());
        System.out.println("Salary :" + employee3.getSalary());
        System.out.println("Prime :" + employee3.getPrime());
        System.out.println("Calc salary: " + employee3.calc_salary());


    }
}
