package com.dxc.polymorphism;
class Employee{
    void Emp_Data(){

        System.out.println("Employee Name: "+"ABC");
    }

}

class Emp_Domain extends Employee {
    void Emp_Data(){
        System.out.println("Employee Domain: "+"SAP");
    }
}
class Company_Data extends Employee {
    void Emp_Data(){
        System.out.println("Company Name: "+"DXC");
    }
}
class poly_RT {
    public static void main(String args[]) {
        //create object
        Employee e;
        //call print method
        e = new Emp_Domain();
        e.Emp_Data();
        e = new Company_Data();
        e.Emp_Data();
    }}
