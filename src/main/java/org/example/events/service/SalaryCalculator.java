package org.example.events.service;

import org.example.events.Models.Employee;
import org.example.events.Models.EmployeeType;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;

public class SalaryCalculator implements ApplicationEventPublisher {

//    Employee employee;


    public void getCalcSalary(Employee employee){
        if (employee.getEmployeeType().equals(EmployeeType.HOURLY)){
            getSalaryFoeHourlyWorkers(employee);
        }else if (employee.getEmployeeType().equals(EmployeeType.SALARIED)){
            getSalaryForSalariedWorkers(employee);
        }else if (employee.getEmployeeType().equals(EmployeeType.COMISSION)){
            getSalaryForCommissionWorkers(employee);
        }else if (employee.getEmployeeType().equals(EmployeeType.SLARIEDCOMISSION)){
            getSalaryForCommissionWithSalaryWorkers(employee);
        }
    }

    public double getSalaryForCommissionWorkers(Employee employee){
        double sale = 500000;
        return employee.getPersentOfSale() * sale;
    }

    public double getSalaryForCommissionWithSalaryWorkers(Employee employee){
        double sale = 500000;
        return sale * employee.getPersentOfSale() + employee.getSalary();
    }

    public double getSalaryFoeHourlyWorkers(Employee employee){
        if(employee.getHourOfWorks() < 0){
            return 0;
        }else if(employee.getHourOfWorks() <= 40){
            return employee.getHourOfWorks() * 10;
        }else{
            return (employee.getHourOfWorks() - 40 ) * 1.5 + 400;
        }
    }
    public double getSalaryForSalariedWorkers(Employee employee){
        return 700000;
    }



    @Override
    public void publishEvent(ApplicationEvent event) {

    }

    @Override
    public void publishEvent(Object o) {

    }
}
