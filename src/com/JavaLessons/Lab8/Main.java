package com.JavaLessons.Lab8;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Employee employee = new Employee();
//        employee.setName_employee("�������� ������� ����������");
//        employee.setPost_employee("��������");
//        employee.setSalary_employee(4500);
//        System.out.println(employee.getName_employee());
//
//        Department department = new Department();
//        department.setName_department("It �����");
//        department.addEmployees(employee);
//
//
//        employee.setDepartment(department,employee);
//        System.out.println(employee.getDepartment().getName_department());
//        System.out.println(department.getEmployee().getName_employee());
//
//        Firm firm = new Firm();
//        firm.setFirm_name("Apple");

        Scanner scn = new Scanner(System.in);
        System.out.println("������� �������� �����:");
        Firm firm = new Firm();
        firm.setFirm_name(scn.nextLine());
        System.out.println("�������� �����: " + firm.getFirm_name());
        System.out.println("������� �������� 1 ������: ");
        Department department1 = new Department();
        department1.setName_department(scn.nextLine());
        firm.addDepartments(department1);
        department1.setFirm(firm);
        System.out.println("������� �������� 2 ������: ");
        Department department2 = new Department();
        department2.setName_department(scn.nextLine());
        firm.addDepartments(department2);
        department2.setFirm(firm);
        System.out.println("������ �������� ��� ���� �����?");
        String choise = scn.nextLine().toLowerCase(Locale.ROOT);
        if(choise.equals("��")){
            Department department3 = new Department();
            System.out.println("������� �������� 3 ������");
            department3.setName_department(scn.nextLine());
            firm.addDepartments(department3);
            department3.setFirm(firm);
            System.out.println("������ ������� ����� ");
            String choise_remove_dep_YesorNo = scn.nextLine();
            if(choise_remove_dep_YesorNo.equals("��")){
                System.out.println("����� ����� ������ �������?");
                int choise_remove_department = scn.nextInt();
                switch (choise_remove_department){
                    case 1:
                        firm.removeDepartments(department1);
                        System.out.println("����� " + department1.getName_department() + " ������� ������!");
                        break;
                    case 2:
                        firm.removeDepartments(department2);
                        System.out.println("����� " + department2.getName_department() + " ������� ������!");
                        break;
                    case 3:
                        firm.removeDepartments(department3);
                        System.out.println("����� " + department3.getName_department() + " ������� ������!");
                        break;
                    default:
                        System.out.println("������ �����!");
                }
            }
        }else{
            System.out.println("������ ������� ����� ?");
            String choise_remove_dep_YesorNo = scn.nextLine();
            if(choise_remove_dep_YesorNo.equals("��")) {
                System.out.println("����� ����� ������ �������?");
                int choise_remove_department = scn.nextInt();
                switch (choise_remove_department) {
                    case 1:
                        firm.removeDepartments(department1);
                        System.out.println("����� " + department1.getName_department() + " ������� ������!");
                        break;
                    case 2:
                        firm.removeDepartments(department2);
                        System.out.println("����� " + department2.getName_department() + " ������� ������!");
                        break;
                    default:
                        System.out.println("������ �����!");
                }
                for (int i =0; i<firm.getDepartments().size();i++){
                    System.out.println( ((Department) firm.getDepartments().get(i)).getName_department() );

                }
            }
        }
        System.out.println("������ �������: ");
        for (int i =0; i<firm.getDepartments().size();i++){
            System.out.println( ((Department) firm.getDepartments().get(i)).getName_department() );

        }









    }
}
