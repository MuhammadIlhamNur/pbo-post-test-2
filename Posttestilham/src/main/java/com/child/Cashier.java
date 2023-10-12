package com.child;

import com.induk.Employee;

public final class Cashier extends Employee {
    public Cashier(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void displayInfo() {
        System.out.println("Nama kasir: " + getName() + ", Gaji: $" + getSalary());
    }
}