package com.company;

public class Application {
    public static void main( String[] args ) {

        Inventory shoeInventory = new Inventory();

        Menu menu = new Menu(shoeInventory);
        menu.showMainMenu();  // call for method MainMenu()


    }


}


