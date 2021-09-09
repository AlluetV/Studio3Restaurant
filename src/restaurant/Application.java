package restaurant;

public class Application {

    // runner
    public static  void main(String[] args){
        Menu menu = new Menu();
        menu.populatedMenu();
        menu.printMenu();
    }
}
