package com.dxc.Inheritance;
//  Multilevel Inheritance

// Base Class
class Employee{
    void Emp_Name(){
       System.out.println("Employee Name: "+"ABC");
    }
    void Emp_Id(){
        System.out.println("Employee ID: "+123);
    }
}
// Extended class
class Emp_Domain extends Employee{
    void Emp_D(){
        System.out.println("Employee Domain: "+"SAP");
    }
}
class Company_Data extends  Emp_Domain{
   void Company_Name(){
       System.out.println("Company Name: "+"DXC");
   }
}
class Company_ML{
public static void main(String args[]) {
    Company_Data C = new Company_Data();
    C.Emp_Id();
    C.Emp_Name();
    C.Emp_D();
    C.Company_Name();
}}
