package org.example.events.WorkFlow;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.example.events.Models.Employee;
import org.example.events.service.EmployeeEdit;
import org.example.events.service.SalaryCalculator;

import java.util.Scanner;

public class PayrollWorkFlow {

    Scanner in = new Scanner(System.in);

    int ch = 10000;

    public void menu(Employee employee){

        SalaryCalculator calc = new SalaryCalculator();
//        EmployeeEdit editEmp = new EmployeeEdit();

        while (ch != 0){

            System.out.println("1.Calc Salary");
            System.out.println("2.Get all employee from DB");
            System.out.println("3.Info about this employee");
            ch = in.nextInt();

            switch (ch){
                case 1:
                    calc.getCalcSalary(employee);
                    break;

                case 2:
                    //get all employees from db
                    break;

                case 3:
                    System.out.println("Name: " + employee.getName());
                    System.out.println("Salary: " + employee.getSalary());
                    System.out.println("Worker Type: " + employee.getEmployeeType());
                    break;

                case 0:
                    System.out.println("System.exit");
                    return;
            }
        }
    }
}
