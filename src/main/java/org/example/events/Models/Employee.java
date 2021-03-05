package org.example.events.Models;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int hourOfWorks; // 10$ for hours
    private double salary;
    private EmployeeType employeeType;
    private double persentOfSale = 0.05;
    private double sale;

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public double getPersentOfSale() {
        return persentOfSale;
    }

    public void setPersentOfSale(double persentOfSale) {
        this.persentOfSale = persentOfSale;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHourOfWorks() {
        return hourOfWorks;
    }

    public void setHourOfWorks(int hourOfWorks) {
        this.hourOfWorks = hourOfWorks;
    }



    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }
}
