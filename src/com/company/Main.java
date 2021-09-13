package com.company;

import com.company.restaurant.Menu;
import com.company.restaurant.MenuItem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Menu menu = new Menu();
        menu.populatedMenu();
        menu.printMenu();

        menu.addItem("Beverage",new MenuItem("Lemonade ", "made whit real lemons" , 2.50, "yes"));
        menu.addItem("Main Course",new MenuItem("Blackened Chicken", "Avocado | black beans | radishes | tobacco onions | candied walnuts" , 10.65 , "no"));

        System.out.println("***********");
        menu.printMenu();
        System.out.println("-------------------"+ "One Item"+"---------------------------------");
        menu.searchItem("Mediterranean Shrimp Salad");
    }
}
