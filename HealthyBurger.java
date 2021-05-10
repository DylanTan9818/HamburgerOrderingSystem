package com.company;

import java.util.HashMap;

public class HealthyBurger extends Hamburger {
    private double price = 10;
    private String breadRollType = "Brown rye";







    public HealthyBurger() {
        super("Veggie Patty");

    }

    public HealthyBurger( HashMap<String, Double> addItem1) {
        super("Veggie Patty",addItem1);


    }



    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getBreadRollType() {
        return breadRollType;
    }

    @Override
    public double itemizeHamburger(HashMap<String, Double> addItem1) {
        double hamburgerPrice = getPrice();
        System.out.println("HealthyBurger " + " on a " + getBreadRollType() + " roll " + "with " + " Veggie Patty " +  ", price is RM " + String.format("%.2f",getPrice()));
        if (addItem1.containsKey("Tomato")) {
            hamburgerPrice += addItem1.get("Tomato");
            System.out.println("Added RM" + String.format("%.2f", addItem1.get("Tomato")) + " for an extra tomato" );
        }

        if (addItem1.containsKey("Lettuce")) {
            hamburgerPrice += addItem1.get("Lettuce");
            System.out.println("Added RM" + String.format("%.2f", addItem1.get("Lettuce")) + " for an extra lettuce" );
        }

        if (addItem1.containsKey("Veggie Patty")) {
            hamburgerPrice += addItem1.get("Veggie Patty");
            System.out.println("Added RM " + String.format("%.2f", addItem1.get("Veggie Patty")) + " for an extra veggie patty " );
        }

        return hamburgerPrice;
    }
}
