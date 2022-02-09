package com.dxc.Inheritance;

// Single Level Inheritance

//Base Class / Super class
class Company{
    String Emp_Name = "ABC";
}
//Derived Class / Sub class
class Basic_Inheritance extends Company {
    int Emp_Id = 123;

    public static void main(String args[]){
        Basic_Inheritance BI = new Basic_Inheritance();
        System.out.println("Employee Name: "+BI.Emp_Name);
        System.out.println("Employee Name: "+BI.Emp_Id);
    }
}
