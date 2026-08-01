package FinanceTracker;

import java.util.*;
public class Main {

    public static void main(String[] args) {

        Expense coffee = new Expense("Starbucks", 8.75, "Food");
        Expense fastFood = new Expense("Chipotle", 15.50, "Food");
        FinanceTracker tracker = new FinanceTracker();

//        System.out.println("Name: " + coffee.getName());
//        System.out.println("Amount: $" + coffee.getAmount());
//        System.out.println("Category: " + coffee.getCategory());
//
//        System.out.println("Name: " + fastFood.getName());
//        System.out.println("Amount: $" + fastFood.getAmount());
//        System.out.println("Category: " + fastFood.getCategory());

//        tracker.addExpense(coffee);
//        tracker.addExpense(fastFood);
//
//        tracker.viewExpenses();
//        tracker.createExpense();

        tracker.start();


    }


}
