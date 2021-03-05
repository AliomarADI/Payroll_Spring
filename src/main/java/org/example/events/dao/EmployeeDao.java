package org.example.events.dao;

import org.example.events.Models.Employee;
import org.example.events.event.SalaryEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDao implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher eventPublisher;

    private static String URL = "jdbc:postgresql://localhost:5432/payrollWorkers";
    private static String USERNAME = "postgres";
    private static String PASSWORD = "postgres";

    private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Employee> getEmploees(){
        List<Employee> employees = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM Employee";
            statement.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  employees;
    }
    public void publishUpdatedSalary(Employee employee){
        System.out.println("EmployeeDao.publishUpdatedSalary");
        System.out.println("Employee: " + employee + " " + employee.getSalary());

//        this.eventPublisher.publishEvent(new SalaryEvent(this,employee));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }
}
