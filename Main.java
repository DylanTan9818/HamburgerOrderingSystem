package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        ArrayList<Hamburger> hamburger1 = new ArrayList<>();
        ArrayList<HealthyBurger> healthyburger = new ArrayList<>();
        ArrayList<DeluxeBurger> deluxeburger = new ArrayList<>();
        ArrayList<DeluxeHealthyBurger> healthydeluxeburger = new ArrayList<>();
        HashMap<String, Double> addItemsHamburger = new HashMap<>();
        HashMap<String, Double> addItemsHealthyBurger = new HashMap<>();


        int i = 0;
        String ans = "yes";


        while(ans.equals("yes")) {
            System.out.println("Please enter your order " + (i+=1));
            System.out.println(" ");
            System.out.println("Enter type of patty: ");
            String meat = scanner.nextLine().toLowerCase();
            System.out.println("Do you want it in set or ala carte?");
            String type = scanner.nextLine().toLowerCase();


            switch(meat) {
                case "beef": case "chicken":
                    if(type.equals("ala carte")) {
                        System.out.println("Do you want to add items?");
                        String ans1 = scanner.nextLine().toLowerCase();
                    if(ans1.equals("yes")) {
                        System.out.println("How many items do you want to add?");
                        String numitems = scanner.nextLine();
                        int numitems3 = Integer.parseInt(numitems);
                        for(i = 0; i <numitems3; i++) {
                            printMenu();
                            String num = scanner.nextLine();
                            int num1 = Integer.parseInt(num);
                            switch (num1) {
                                case 0:
                                    addItemsHamburger.put("Tomato", 0.50);
                                    break;
                                case 1:
                                    addItemsHamburger.put("Lettuce", 0.50);
                                    break;
                                case 2:
                                    addItemsHamburger.put("Cheese", 1.00);
                                    break;
                                case 3:
                                    addItemsHamburger.put("Patty", 2.00);
                                    break;
                                case 4:
                                    addItemsHamburger.put("Egg", 1.00);
                                    break;
                            }
                        }
                        hamburger1.add(new Hamburger(meat,addItemsHamburger));
                        System.out.print("Do you still want to make an order? ");
                        ans = scanner.nextLine().toLowerCase();
                    }else {
                        hamburger1.add(new Hamburger(meat));
                        System.out.println(" ");
                        System.out.print("Do you still want to make an order? ");
                        ans = scanner.nextLine().toLowerCase();
                        break;
                    }
                    }else if(type.equals("set")){
                        deluxeburger.add(new DeluxeBurger(meat));
                        System.out.println(" ");
                        System.out.print("Do you still want to make an order? ");
                        ans = scanner.nextLine().toLowerCase();
                        break;
                    }
                    break;
                case "veggie patty":
                    if(type.equals("ala carte")) {
                        System.out.println("Do you want to add items?");
                        String ans2 = scanner.nextLine().toLowerCase();
                        if(ans2.equals("yes")) {
                            System.out.println("How many items do you want to add?");
                            String numitems1 = scanner.nextLine();
                            int numitems2 = Integer.parseInt(numitems1);
                            for(i = 0; i <numitems2; i++) {
                                printMenu1();
                                String num = scanner.nextLine();
                                int num1 = Integer.parseInt(num);
                                switch (num1) {
                                    case 0:
                                        addItemsHealthyBurger.put("Tomato", 0.50);
                                        break;
                                    case 1:
                                        addItemsHealthyBurger.put("Lettuce", 0.50);
                                        break;
                                    case 2:
                                        addItemsHealthyBurger.put("Veggie Patty", 3.00);
                                        break;
                                }

                            }
                            healthyburger.add(new HealthyBurger(addItemsHealthyBurger));
                            System.out.print("Do you still want to make an order? ");
                            ans = scanner.nextLine().toLowerCase();
                        }else {
                            healthyburger.add(new HealthyBurger());
                            System.out.println(" ");
                            System.out.print("Do you still want to make an order? ");
                            ans = scanner.nextLine().toLowerCase();
                            break;
                        }
                    }else if(type.equals("set")){
                        healthydeluxeburger.add(new DeluxeHealthyBurger());
                        System.out.println(" ");
                        System.out.print("Do you still want to make an order? ");
                        ans = scanner.nextLine().toLowerCase();
                        break;
                    }
                    break;
            }
        }



        double total = 0;
        for(int j = 0; j < deluxeburger.size(); j++) {
                total += deluxeburger.get(j).itemizeHamburger();
        }


        double total1 = 0;
        for(int j = 0; j < healthydeluxeburger.size(); j++) {
            total1 += healthydeluxeburger.get(j).itemizeHamburger();

        }


        double total2 = 0;
        for(int j = 0; j < hamburger1.size(); j++) {
            total2 += hamburger1.get(j).itemizeHamburger(addItemsHamburger);
        }

        double total3 = 0;
        for(int j = 0; j < healthyburger.size(); j++) {
            total3 += healthyburger.get(j).itemizeHamburger(addItemsHealthyBurger);
        }
        System.out.println("Total Burger price is RM " + String.format("%.2f", (total + total1 + total2 + total3)) );

    }

    private static void printMenu(){
        System.out.println("Add extra items:\npress");
        System.out.println("0 - Tomato\n" +
                "1 - Lettuce\n" +
                "2 - Cheese\n" +
                "3 - Patty\n" +
                "4 - Egg\n" );
    }

    private static void printMenu1(){
        System.out.println("Add extra items:\npress");
        System.out.println("0 - Tomato\n" +
                "1 - Lettuce\n" +
                "2 - Veggie Patty\n");
    }

}
