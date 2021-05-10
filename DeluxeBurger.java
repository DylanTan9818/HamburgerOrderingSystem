package com.company;

public class DeluxeBurger extends Hamburger {
    private String sides = "drink and chips";
    private double price = 13.00;

    public DeluxeBurger(String meat) {
        super(meat);

    }

    public String getSides() {
        return sides;
    }

    public double getPrice() {
        return price;
    }



    public double itemizeHamburger() {
        double hamburgerPrice = getPrice();
        System.out.println("Hamburger "  + getMeat() + " set with  " + getSides()+ " is RM" + String.format("%.2f",getPrice()));
        return hamburgerPrice;
    }


}
