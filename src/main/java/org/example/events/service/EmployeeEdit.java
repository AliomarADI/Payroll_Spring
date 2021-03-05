package org.example.events.service;

import org.example.events.Models.Employee;
import org.example.events.Models.EmployeeType;
import org.example.events.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

//@Service
public class EmployeeEdit implements EmployeeService{

    Scanner in = new Scanner(System.in);

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee createEmployee(){

        Employee employee = new Employee();
        System.out.println("Please enter name: ");
        String name = in.next();

        employee.setName(name);

        System.out.println("Please choose which type worker: ");
        System.out.println("1.Salaried\n2.Hourly\n3.Commission\n4.Comission with salary");

        int choose = in.nextInt();

        if (choose == 1){
            employee.setSalary(700000);
            employee.setEmployeeType(EmployeeType.SALARIED);
        }else if (choose == 2){
            System.out.println("PLease enter hours of works: ");
            int hours = in.nextInt();
            employee.setEmployeeType(EmployeeType.HOURLY);
            employee.setHourOfWorks(hours);
        }else if (choose == 3){
            System.out.println("Please enter your sale:");
            double sale = in.nextInt();
            employee.setEmployeeType(EmployeeType.COMISSION);
            employee.setSale(sale);
        }else if (choose == 4){
            System.out.println("Please enter your sale: ");
            double sale = in.nextInt();
            employee.setSale(sale);
            employee.setEmployeeType(EmployeeType.SLARIEDCOMISSION);
            employee.setSalary(500000);
        }else{
            System.out.println("This worker doesnt exist");
        }
        return employee;
    }


//    @Override
//    public Employee createEmployee(Employee employee) {
//        return null;
//    }

    @Override
    public void updateEmployee(Employee employee) {
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> getEmployeeByEmployeeType(String string) {
        //TODO Правильная связка между EmpType and Employee
        return employeeRepository.getEmployeeByEmployeeType(EmployeeType.valueOf(string));
    }

    @Override
    public List<Employee> getEmployeeByHourOfWorksIsGreaterThanEqual(int countHour) {
        return employeeRepository.getEmployeeByHourOfWorksIsGreaterThanEqual(countHour);
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee getById(int id) {
        return null;
    }


}
