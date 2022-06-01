package com.JavaLessons.Lab8a;

public class Main {
    public static void main(String[] args) {
        Firm firm = new Firm();
        firm.setFirm_name("JackDaniels");
        Department department = new Department();
        department.setDepartment_name("Finance");
        department.setDepartment_numb_of_employee(30);
        Department department2 = new Department();
        department2.setDepartment_name("Chill");
        department2.setDepartment_numb_of_employee(15);
        Employee employee = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        employee.setEmployee_name("Антропов Евгений Дмитриевич");
        employee.setEmployee_post("Менеджер");
        employee.setEmployee_salary(23000);
        employee2.setEmployee_name("Набоков Владимир Владимирович");
        employee2.setEmployee_post("Writer");
        employee2.setEmployee_salary(450000);
        employee3.setEmployee_name("Обломов Илья Ильич");
        employee3.setEmployee_post("Chiller");
        employee3.setEmployee_salary(1200);

        System.out.println("Название фирмы:");
        System.out.println(firm.getFirm_name());
        System.out.println("Название первого отдела");
        System.out.println(department.getDepartment_name());
        System.out.println("Количество человек:");
        System.out.println(department.getDepartment_numb_of_employee());
        System.out.println("Название второго отдела:");
        System.out.println(department2.getDepartment_name());
        System.out.println("Количество человек:");
        System.out.println(department2.getDepartment_numb_of_employee());
        System.out.println("ФИО сотрудника:");
        System.out.println(employee.getEmployee_name());
        System.out.println("Должность:");
        System.out.println(employee.getEmployee_post());
        System.out.println("Оклад:");
        System.out.println(employee.getEmployee_salary());
        System.out.println("ФИО сотрудника:");
        System.out.println(employee2.getEmployee_name());
        System.out.println("Должность:");
        System.out.println(employee2.getEmployee_post());
        System.out.println("Оклад:");
        System.out.println(employee2.getEmployee_salary());
        System.out.println("ФИО сотрудника:");
        System.out.println(employee3.getEmployee_name());
        System.out.println("Должность:");
        System.out.println(employee3.getEmployee_post());
        System.out.println("Оклад:");
        System.out.println(employee3.getEmployee_salary());




    }
}
