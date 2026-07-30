package FinanceTracker;

// class
public class Expense {

    private String name;
    private double amount;
    private String category;

    // constructor
    public Expense(String name, double amount, String category)
    {
        this.name = name;
        this.amount = amount;
        this.category = category;
    }

    //getters
    public String getName(){
        return name;
    }
    public double getAmount(){
        return amount;
    }
    public String getCategory(){
        return category;
    }

}
