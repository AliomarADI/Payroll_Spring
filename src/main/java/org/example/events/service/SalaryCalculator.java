package org.example.events.service;

import org.example.events.Models.Employee;
import org.example.events.Models.EmployeeType;
import org.example.events.dao.EmployeeDao;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;

public class SalaryCalculator{

//    Employee employee;

    EmployeeDao employeeDao = new EmployeeDao();

    public void getCalcSalary(Employee employee){
        if (employee.getEmployeeType().equals(EmployeeType.HOURLY)){
            employee.setSalary(
                    getSalaryForHourlyWorkers(employee));
        }else if (employee.getEmployeeType().equals(EmployeeType.SALARIED)){
            employee.setSalary(
                    getSalaryForSalariedWorkers(employee));
        }else if (employee.getEmployeeType().equals(EmployeeType.COMISSION)){
            employee.setSalary(
                    getSalaryForCommissionWorkers(employee));
        }else if (employee.getEmployeeType().equals(EmployeeType.SLARIEDCOMISSION)){
            employee.setSalary(
                    getSalaryForCommissionWithSalaryWorkers(employee));

        }
        employeeDao.publishUpdatedSalary(employee);
    }

    public double getSalaryForCommissionWorkers(Employee employee){
        return employee.getPersentOfSale() * employee.getSale()*1.1;
    }

    public double getSalaryForCommissionWithSalaryWorkers(Employee employee){
        return employee.getSale() * employee.getPersentOfSale() + employee.getSalary()*1.1;
    }

    public double getSalaryForHourlyWorkers(Employee employee){
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


}
