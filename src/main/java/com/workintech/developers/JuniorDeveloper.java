package com.workintech.developers;

import com.workintech.developers.Employee;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " is working as a Junior Developer.");
        this.setSalary(this.getSalary() + 1000);
    }
}