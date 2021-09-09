package restaurant;


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
        categories.put("Desserts", buildDesserts());
    }

    private List<MenuItem> buildDesserts(){
        List <MenuItem> menuItemList = new LinkedList<>();
        menuItemList.add(new MenuItem("apple pie", "homemade" , 7.99 , "no"));
        menuItemList.add(new MenuItem( "cheesecake", "vegetarian" , 6.99 , "no"));
        menuItemList.add(new MenuItem( "flan pudding", "homemade, vegetarian" , 5.99 , "yes"));

        return menuItemList;
    }

    private List<MenuItem> buildAppetizers(){
        List <MenuItem> menuItemList = new LinkedList<>();
        menuItemList.add(new MenuItem("Cesar salad", "homemade" , 4.99 , "no"));
        menuItemList.add(new MenuItem( "Avocado Salad", "vegetarian" , 6.99 , "no"));
        menuItemList.add(new MenuItem( "Kale soup", "homemade, vegetarian" , 5.99, "yes"));

        return menuItemList;
    }

    // print method
    public void printMenu(){
        for (Map.Entry<String, List<MenuItem>> category : categories.entrySet()) {
            System.out.println(category.getKey());
            for(MenuItem myItem : category.getValue()) {
                System.out.println(myItem.getNameItem()+"......"+ myItem.getDescription());
            }
        }
    }

}
