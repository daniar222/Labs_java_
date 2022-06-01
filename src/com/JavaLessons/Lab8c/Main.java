package com.JavaLessons.Lab8c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Firm firm = new Firm();
        firm.setFirm_name("JackDaniels");
        Department department = new Department();
        firm.Add_departments_list(department);//add depart
        department.setFirm(firm);//соответсвие фирме
        department.setDepartment_name("Finance");
        Department department2 = new Department();
        firm.Add_departments_list(department2);//add depart2
        department2.setFirm(firm);//соответсвие фирме
        department2.setDepartment_name("Chill");
        Employee employee = new Employee();
        department.Add_employees_list(employee);
        employee.setDepartment(department);
        Employee employee2 = new Employee();
        department.Add_employees_list(employee2);
        employee.setDepartment(department);
        Employee employee3 = new Employee();
        department2.Add_employees_list(employee3);
        employee3.setDepartment(department2);
        Employee employee4 = new Employee();
        employee4.setDepartment(department2);
        department2.Add_employees_list(employee4);
        Employee employee5 = new Employee();
        employee5.setDepartment(department2);
        department2.Add_employees_list(employee5);

        department2.Remove_employees_list(employee5);

        employee.setEmployee_name("Антропов Евгений Дмитриевич");
        employee.setEmployee_post("Менеджер");
        employee.setEmployee_salary(23000);
        employee2.setEmployee_name("Набоков Владимир Владимирович");
        employee2.setEmployee_post("Writer");
        employee2.setEmployee_salary(450000);
        employee3.setEmployee_name("Обломов Илья Ильич");
        employee3.setEmployee_post("Chiller");
        employee3.setEmployee_salary(1200);
        employee4.setEmployee_name("Раскольников Родион Романович");
        employee4.setEmployee_post("Студенд");
        employee4.setEmployee_salary(600);


        System.out.println("Введите ФИО сотрудника для поиска:");
        String name = scn.nextLine();
        Employee employee1 = firm.get_employee(name);
        if(employee1 == null){
            System.out.println("Такого сотрудника не найдено в фирме " + firm.getFirm_name());
        }else{
            System.out.println("Фирма:" + firm.getFirm_name());
            System.out.println("Название отдела:" + employee1.getDepartment().getDepartment_name());
            System.out.println("Должность:" + employee1.getEmployee_post());
            System.out.println("Оклад:" + employee1.getEmployee_salary());

        }



    }
}
