package com.pluralsight.models;

public class Topping {

    private String name;
    private String type;
    private boolean isExtra;

    public Topping(String name, String type, boolean isExtra) {
        this.name = name.toLowerCase();
        this.type = type.toLowerCase();
        this.isExtra = isExtra;
    }

    public Topping(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean isExtra() {
        return isExtra;
    }

    @Override
    public String toString() {
        if (isExtra){
            return  name + "(extra)";
        }
        return name;
    }
}
