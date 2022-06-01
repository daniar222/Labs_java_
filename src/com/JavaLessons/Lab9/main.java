package com.JavaLessons.Lab9;

import org.w3c.dom.ls.LSOutput;

public class main {
    public static void main(String[] args) {
        Firm firm = new Firm("IO Corp");
        Department department = new Department("Economic",12);
        Employee employee_1 = new Employee("Elizabet Bennet", "assistant", 12000);
        FTemployee fTemployee_1 = new FTemployee("Mr Darcy","Landowner" , 34000, 12000);
        ContractEmployee contractEmployee = new ContractEmployee("Jane Bennett","musicist",12000);


        employee_1.calc_salary();//Print salary
        fTemployee_1.Calc_salary();//Print salary
        contractEmployee.calc_salary();//Print salary

        String line = "fcfe1232f";
        System.out.println(line);
        StringBuffer b = new StringBuffer();
        char[] a;
        a = line.toCharArray();
        for (int i=0; i<a.length;i++){
            if(Character.isDigit(a[i])){
                b.append(a[i]);
            }
        }
        System.out.println(b);



    }
}
