package com.child;

import com.induk.*;

public final class Product extends Person {
    public double price;

    public Product(String name, double price) {
        super(name);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void displayInfo() {
        System.out.println("Nama Barang: " + getName() + ", Harga: $" + getPrice());
    }
}
