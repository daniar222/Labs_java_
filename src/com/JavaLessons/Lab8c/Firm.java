    package com.JavaLessons.Lab8c;

    import java.util.ArrayList;

    public class Firm {
        private String Firm_name ;
        public String getFirm_name() {
            return Firm_name;
        }
        public void setFirm_name(String firm_name) {
            Firm_name = firm_name;
        }

        private ArrayList departments_list = new ArrayList();
        public ArrayList getDepartments_list(){
            return departments_list;
        }
        public void Add_departments_list(Department department){
            departments_list.add(department);
        }
        public void Remove_department_list(Department department){
            departments_list.remove(department);
        }

        public Employee get_employee(String name){
            for(int i =0; i<departments_list.size(); i++){
                Department department = (Department) departments_list.get(i);

                for(int j=0; j<department.getEmployees_list().size();j++){
                    Employee employee = (Employee) department.getEmployees_list().get(i);

                    if(employee.getEmployee_name().equals(name)){
                        return employee;
                    }
                }

            }
            return null;
        }



    }
