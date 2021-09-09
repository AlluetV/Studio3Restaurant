package com.company.restaurant;


import java.util.*;


public class Menu {

   private Map<String, List<MenuItem>> categories;



    public Menu(){
        categories = new HashMap<>();
    }



// methods
    // class introduce menu items
    public  void  populatedMenu(){
        categories.put("Appetizers", buildAppetizers());
        categories.put("Main Course", buildCourseMenu());
        categories.put("Desserts", buildDesserts());
    }

    private List<MenuItem> buildDesserts(){
        List <MenuItem> menuItemList = new LinkedList<>();
        menuItemList.add(new MenuItem("Chocolate Mousse Cake ", "Chantilly Cream | Vine Ripe Berries | Chocolate Flake Garnish" , 9.99 , "no"));
        menuItemList.add(new MenuItem( "Mini Pumpkin Cheesecake", "Pumpkin-Infused Cheesecake | Cookie Crumble Shell | Pumpkin Butter Garnish | Chantilly Cream | Seasonal Berries" , 9.50 , "no"));
        menuItemList.add(new MenuItem( "Belgium Waffle ", "Cinnamon Sugar Glazed Apples | Cinnamon Gelato | Whiskey Caramel Drizzle" , 9.65 , "yes"));

        return menuItemList;
    }

    private List<MenuItem> buildCourseMenu(){
        List <MenuItem> menuItemList = new LinkedList<>();
        menuItemList.add(new MenuItem("Blackened Chicken", "Avocado | black beans | radishes | tobacco onions | candied walnuts" , 10.65 , "no"));
        menuItemList.add(new MenuItem( "Mezze Plate", "Falafel | hummus | feta | tabouleh | black olives | chopped romaine | grilled pita" , 12.65 , "no"));
        menuItemList.add(new MenuItem( "Cedar Smoked Salmon", "Crumbled bleu cheese | candied walnuts | roasted grape vinaigrette" , 12.65 , "yes"));
        menuItemList.add(new MenuItem( "Grilled Northwind Farm Hanger Steak", "Melted cheddar | roasted onions | portobello | mushroom hash" , 10.65 , "yes"));
        return menuItemList;
    }

    private List<MenuItem> buildAppetizers(){
        List <MenuItem> menuItemList = new LinkedList<>();
        menuItemList.add(new MenuItem("Main Course Trio", "Three salads from our seasonal selection" , 10.65 , "no"));
        menuItemList.add(new MenuItem( "Mediterranean Shrimp Salad", "Artichoke hearts | chickpeas | cucumber | feta | red onion | tomato & citrus vinaigrette" , 10.65 , "no"));
        menuItemList.add(new MenuItem( "Pan Asian Raw Kale Salad", "Asian vegetables | red | onion | red pepper | mushrooms | crispy | noodles" , 9.65, "yes"));

        return menuItemList;
    }

    // print method
    public void printMenu(){
        for (Map.Entry<String, List<MenuItem>> category : categories.entrySet()) {
            System.out.println("\n" + category.getKey() + "\n");
            for(MenuItem myItem : category.getValue()) {
                if(myItem.getIsNew().equals("yes")){
                    System.out.println("New");
                }
                System.out.println(myItem.getNameItem()+"....................." + myItem.getPrice());
                System.out.println(myItem.getDescription() + "\n");

            }
        }
    }

}
