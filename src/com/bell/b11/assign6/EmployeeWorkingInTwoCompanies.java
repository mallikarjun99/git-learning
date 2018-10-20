package com.bell.b11.assign6;

import java.util.Objects;
import java.util.Scanner;

public class EmployeeWorkingInTwoCompanies {

    public static void main(String[] args){
        Address add1=new Address(12, "Ashburn", 20148);
        Employeee emp1=new Employeee(1, "malli", add1);

        Address add2=new Address(13,"Herndon", 20151);
        Employeee emp2=new Employeee(2, "Simha", add2);

        Address add3=new Address(31,"Chantilly",20157);
        Employeee emp3=new Employeee(20,"malli", add3);

        Employeee[] emparray1={emp1,emp2};
        Employeee[] emparray2={emp2,emp3};

        Company c1=new Company("Welforgo", emparray1);
        Company c2=new Company("BOFA", emparray2);



    }
    private static void findemployeeworkingintwocompanies(Company c1, Company c2){
        Employeee[] firstcompanyEmp=c1.getEmployeees();
        Employeee[] secondcompanyEmp=c2.getEmployeees();

        for(Employeee e1:firstcompanyEmp){
            for(Employeee e2:secondcompanyEmp){
                if(e1.getName().equals(e2.getName())&& e1.getAddress().equals(e2.getAddress())){
                    System.out.println(e1.getName());
                }
            }
        }

    }
}
