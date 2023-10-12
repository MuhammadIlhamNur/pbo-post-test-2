package com.induk;

public class Employee extends Person {
    public double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public final double getSalary() {
        return salary;
    }

    public final void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        System.out.println("Nama karyawan: " + getName() + ", Gaji: $" + getSalary());
    }
}
