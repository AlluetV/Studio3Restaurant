package com.company;

import com.company.restaurant.Menu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Menu menu = new Menu();
        menu.populatedMenu();
        menu.printMenu();
    }
}
