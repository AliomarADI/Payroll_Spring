package org.example.events.repository;

import org.example.events.Models.Employee;
import org.example.events.Models.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface EmployeeRepository {
//        extends JpaRepository<Employee,Long> {

    List<Employee> getEmployeeByEmployeeType(EmployeeType employeeType);

    List<Employee> getEmployeeByHourOfWorksIsGreaterThanEqual(int countHour);

    void deleteById(int id);

    List<Employee> getById(int id);
}
