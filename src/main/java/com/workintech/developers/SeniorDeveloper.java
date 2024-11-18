package com.workintech.developers;

import com.workintech.developers.Employee;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " is working as a Senior Developer.");
        this.setSalary(this.getSalary() + 3000);
    }
}