package com.company;

public class DeluxeHealthyBurger extends DeluxeBurger{

    private double price = 15.00;
    public DeluxeHealthyBurger(){

        super("Veggie Patty");
    }


    public double getPrice() {

        return price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = getPrice();
        System.out.println("HealthyBurger set with " + getSides() + " is RM" + String.format("%.2f",getPrice()));
        return hamburgerPrice;
    }
}
