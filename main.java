package com.dxc.Inheritance;
//Multiple inheritances


interface Employee_Multi{
    public void Emp_Name();
    public void Emp_Id();
}

interface Emp_Domain_Multi {
    public void Emp_D();
}
// Extended class
interface company extends  Employee_Multi,Emp_Domain_Multi{
    public void Company_Name();
}
class Company_Multi_Data implements company {
    @Override
    public void Emp_Name() {
        System.out.println("Emp Name: "+"ABC");
    }

    @Override
    public void Emp_Id() {
        System.out.println("Emp ID: "+123);
    }

    @Override
    public void Emp_D() {
        System.out.println("Emp Domain: "+"SAP");
    }

    @Override
    public void Company_Name() {
        System.out.println("Company Name: "+"Dxc");
    }
}

public class main {
    public static void main(String args[]) {
        Company_Multi_Data C = new Company_Multi_Data();
        C.Emp_Id();
        C.Emp_Name();
        C.Emp_D();
        C.Company_Name();
    }}
