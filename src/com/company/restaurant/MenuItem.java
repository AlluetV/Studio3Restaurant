package com.company.restaurant;

import java.util.Objects;

public class MenuItem {
    
    //fields


    private String nameItem; //name of item
    private String description; // description of the item
    private double price; //price of item dish
    private String isNew;  //it is a new dish in the menu

    //constructor


    public MenuItem(){

    }

    public MenuItem( String nameItem, String description, double price, String isNew) {


        this.nameItem = nameItem;
        this.description = description;
        this.price = price;
        this.isNew = isNew;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "nameItem='" + nameItem + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", isNew='" + isNew + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 && Objects.equals(nameItem, menuItem.nameItem) && Objects.equals(description, menuItem.description) && Objects.equals(isNew, menuItem.isNew);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameItem, description, price, isNew);
    }
}
