package org.example.events.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class SalaryEventListener implements ApplicationListener<SalaryEvent> {

    @Override
    public void onApplicationEvent(SalaryEvent salaryEvent) {
        System.out.println("Changed: " + salaryEvent.getEmployee().getName() + " "
        + salaryEvent.getEmployee().getName());
    }
}
