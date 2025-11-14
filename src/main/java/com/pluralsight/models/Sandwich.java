package com.pluralsight.models;

import com.pluralsight.ui.UserInterface;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements UserInterface {




    //private List<Topping> toppings;
    private  String bread;
    private final String  size;
    private double price;
    private boolean isToasted;
    private boolean extraMeat;
    private boolean extraCheese;

    public Sandwich(String bread, String size, double price, boolean isToasted, boolean extraMeat, boolean extra) {
        this.bread = bread;
        this.size = size;
        this.price = price;
        this.isToasted = isToasted;
        this.extraMeat = extraMeat;
        this.extraCheese = extraCheese;
        //this.toppings
    }




    @Override
    public double getPrice() {
        double price = 0;
        if (size.equals("4")) price += 5.50;
        else if (size.equals("8")) price += 7.00;
        else if (size.equals("12")) price += 8.50;
            
        for (String Topping : toppings) {
            String lower = topping.toLowerCase();

        if (lower.equals)
    }
}
