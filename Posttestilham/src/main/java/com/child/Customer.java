package com.child;

import com.induk.Person;

public final class Customer extends Person {
    public double wallet;

    public Customer(String name, double wallet) {
        super(name);
        this.wallet = wallet;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    @Override
    public void displayInfo() {
        System.out.println("Nama pelanggan: " + getName() + ", Isi dompet: $" + getWallet());
    }
}
