package com.pluralsight.models;

import java.util.ArrayList;

public class Topping {

    private String name;
    private double price;
    private boolean isExtra;

    public Topping(String name, double price, boolean isExtra) {
        this.name = name;
        this.price = price;
        this.isExtra = isExtra;
    }

    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isExtra() {
        return isExtra;
    }

    public void setExtra(boolean extra) {
        isExtra = extra;
    }

    @Override
    public String toString() {
        if (isExtra){
            return  name + "(extra)";
        }
        return name;
    }
}
