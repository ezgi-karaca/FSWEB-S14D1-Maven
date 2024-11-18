package com.workintech.developers;

import com.workintech.developers.Employee;

public class MidDeveloper extends Employee {
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " is working as a Mid Developer.");
        this.setSalary(this.getSalary() + 2000);
    }
}