package org.example.events.event;

import org.example.events.Models.Employee;
import org.springframework.context.ApplicationEvent;

public class SalaryEvent extends ApplicationEvent {

    private Employee employee;

    public SalaryEvent(Object source, Employee employee) {
        super(source);
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
