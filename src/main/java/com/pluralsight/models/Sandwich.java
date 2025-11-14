package com.pluralsight.models;

import com.pluralsight.ui.UserInterface;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements UserInterface {

    private List<Topping> toppings;
    private  String bread;
    private  String  size;
    //private double price;
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
        this.toppings = toppings;
    }


    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    //price math
    @Override
    public double getPrice() {
        double price = 0;

        //base price
        if (size.equals("4")) price += 5.50;
        else if (size.equals("8")) price += 7.00;
        else if (size.equals("12")) price += 8.50;

        //loop for toppings
        for (Topping topping : toppings) {
            String type = topping.getType();
        }


        //meat
        if (type.equals("meat")) {
            if (size.equals("4")) price += 1.00;
            else if (size.equals("8")) price += 2.00;
            else price += 3.00;
        }

        //cheese
        else if (type.equals("cheese")) {
            if (size.equals("4")) price += 0.75;
            else if (size.equals("8")) price += 1.50;
            else price += 2.25
        }

        //extra meat
        if (extraMeat) {
            if (size.equals("4")) price += 0.50;
            else if (size.equals("8")) price += 1.00;
            else price += 1.50;
        }

        //extra cheese
        if (extraCheese) {
            if (size.equals("4")) price += 0.30;
            else if (size.equals("8")) price += 0.60;
            else price += 0.90;
        }

        return price;
    }


    @Override
    public String toString() {
        String output = "";

        output += size + "\" " + bread;
        if (isToasted) {
            output += " (toasted)";
        }
        output += "\n";

        for (Topping t : toppings) {
            output += "  - " + t.toString() + "\n";
        }

        output += "Total: $" + String.format("%.2f", getPrice());

        return output;
    }
}

