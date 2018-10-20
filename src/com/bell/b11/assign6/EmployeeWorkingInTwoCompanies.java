package com.bell.b11.assign6;

import java.util.Objects;
import java.util.Scanner;

public class EmployeeWorkingInTwoCompanies {

    public static void main(String[] args){
        System.out.println(" Enter Number of Employees");
        Scanner scan=new Scanner(System.in);
        int count=scan.nextInt();
        company[] com=new company[count];
        company cmpy=null;
        for (int i=0; i<count; i++){
            System.out.println("Enter Employee" + count + " details");
            System.out.println("Enter Name");
            String name=scan.next();
            System.out.println(" Enter Address");
            String Address=scan.next();

            cmpy=new company( name, Address);
            com[i]=cmpy;
        }



    }
}
class company{
    String name;
    String employees;

    public company( String name, int id, String employees){
        this.name=name;
        this.employees=employees;
    }

    public company(String name, String address) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "company{" +
                "name='" + name + '\'' +
                ", employees='" + employees + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        company company = (company) o;
        return Objects.equals(name, company.name) &&
                Objects.equals(employees, company.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employees);
    }
}
class employee extends company{
    int id;
    String address;
    public employee(String name, String employees, int id, String address) {
        super( name, id, employees);
        this.id=id;
        this.address=address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        employee employee = (employee) o;
        return id == employee.id &&
                Objects.equals(address, employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, address);
    }
}
class Address extends employee{
    int housenumber;
    String street;
    int zip;

    public Address(String name, String employees, int id, String address, int housenumber, String street, int zip) {
        super(name, employees, id, address);
        this.housenumber=housenumber;
        this.street=street;
        this.zip=zip;
    }


    public int getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(int housenumber) {
        this.housenumber = housenumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "housenumber=" + housenumber +
                ", street='" + street + '\'' +
                ", zip=" + zip +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Address address = (Address) o;
        return housenumber == address.housenumber &&
                zip == address.zip &&
                Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), housenumber, street, zip);
    }
}