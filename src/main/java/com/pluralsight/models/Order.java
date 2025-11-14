package com.pluralsight.models;

import java.util.List;

public class Order {

    private List<MenuItem> menuItems;
    //this.menuItems = new ArrayList<>(); <-- for constructor



    public void add(MenuItem menuItem) {
        menuItems.add(menuItem);
    }
}



