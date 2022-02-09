package com.dxc.Inheritance;
//hierarchical inheritance
// Base Class
class Employee_HL{
    void Emp_Name(){
        System.out.println("Employee Name: "+"ABC");
    }
    void Emp_Id(){
        System.out.println("Employee ID: "+123);
    }
}
// Extended class
class Emp_Domain_HL extends Employee_HL{
    void Emp_D(){
        System.out.println("Employee Domain: "+"SAP");
    }
}
class Company_Data_HL extends  Employee_HL{
    void Company_Name(){
        System.out.println("Company Name: "+"DXC");
    }
}
class Company_HL{
    public static void main(String args[]) {
        Emp_Domain_HL C = new Emp_Domain_HL();
        C.Emp_Id();
        C.Emp_Name();
        C.Emp_D();
        //C.Company_Name();
    }}