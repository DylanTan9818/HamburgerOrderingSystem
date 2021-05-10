package com.company;

import java.util.HashMap;

public class Hamburger {
    private String meat;
    private double price = 9;
    private String BreadRollType = "White";


    private HashMap<String, Double> addItems;


    public Hamburger(String meat) {
        this.meat = meat;

    }

    public Hamburger(String meat, HashMap<String, Double> addItems) {
        this.meat = meat;
        this.addItems = addItems;
    }

    public double getPrice() {

        return price;
    }

    public String getBreadRollType() {

        return BreadRollType;
    }

    public String getMeat() {

        return meat;
    }




    public double itemizeHamburger(HashMap<String, Double> addItems) {
        double hamburgerPrice = getPrice();
        System.out.println( "Hamburger " + " on a " + getBreadRollType() + " roll " + "with " + getMeat() +  ", price is RM " + String.format("%.2f",getPrice()));

        if (addItems.containsKey("Tomato") == true) {
            hamburgerPrice += addItems.get("Tomato");
            System.out.println("Added RM " + String.format("%.2f", addItems.get("Tomato")) + " for an extra tomato" );
        }
        if (addItems.containsKey("Lettuce") == true) {
            hamburgerPrice += addItems.get("Lettuce");
            System.out.println("Added RM " + String.format("%.2f", addItems.get("Lettuce")) + " for an extra lettuce" );
        }

        if (addItems.containsKey("Cheese") == true) {
            hamburgerPrice += addItems.get("Cheese");
            System.out.println("Added RM" + String.format("%.2f", addItems.get("Cheese")) + " for an extra cheese " );
        }

        if (addItems.containsKey("Patty") == true) {
            hamburgerPrice += addItems.get("Patty");
            System.out.println("Added RM" + String.format("%.2f", addItems.get("Patty")) + " for an extra patty" );
        }

        if (addItems.containsKey("Egg") == true) {
            hamburgerPrice += addItems.get("Egg");
            System.out.println("Added RM" + String.format("%.2f",addItems.get("Egg")) + " for an extra egg" );
        }



        return hamburgerPrice;
    }
}

