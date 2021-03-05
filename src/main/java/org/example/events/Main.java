package org.example.events;

import org.example.events.Models.Employee;
import org.example.events.Models.EmployeeType;
import org.example.events.WorkFlow.PayrollWorkFlow;
import org.example.events.config.Config;
import org.example.events.dao.EmployeeDao;
import org.example.events.service.EmployeeEdit;
import org.example.events.service.EmployeeService;
import org.example.events.service.SalaryCalculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        EmployeeDao employeeDao =context.getBean("employeeDao", EmployeeDao.class);
//        EmployeeEdit employeeEdit = context.getBean("employeeEdit", EmployeeEdit.class);

        PayrollWorkFlow pwf = new PayrollWorkFlow();

        EmployeeEdit editEmp = new EmployeeEdit();

        pwf.menu(editEmp.createEmployee());

//        List<Employee> employeeList = employeeEdit.getEmployeeByHourOfWorksIsGreaterThanEqual(5);

//        System.out.println("Employee List: " + employeeList);
    }
}
