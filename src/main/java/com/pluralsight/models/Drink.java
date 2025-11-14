package com.pluralsight.models;

public class Drink extends MenuItem {

    private String size;
    private String flavor;

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }


    @Override
    public double getPrice() {
        return switch (this.size.toLowerCase()){
            case  "small" -> 2.0;
            case  "medium" -> 2.5;
            case "large" -> 3.0;
        }
    }
}
