package org.example.events.service;

import org.example.events.Models.Employee;
import org.example.events.Models.EmployeeType;

import java.util.List;

public interface EmployeeService {

//    public Employee createEmployee(Employee employee);
    public void updateEmployee(Employee employee);
    public void deleteEmployee(int id);

    List<Employee>  getEmployeeByEmployeeType(String string);

    List<Employee> getEmployeeByHourOfWorksIsGreaterThanEqual(int countHour);

    void deleteById(int id);

    Employee getById(int id);
}
