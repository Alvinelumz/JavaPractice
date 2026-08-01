package FinanceTracker;
import java.util.*;

//class
public class FinanceTracker {

    private ArrayList<Expense> expenses;
    private Scanner kb;

    //constructor
    public FinanceTracker()
    {
        expenses = new ArrayList<>();
        kb = new Scanner(System.in);
    }

    // helper methods
    private String getNameFromUser()
    {
        System.out.print("Enter the Name: ");
        String name = kb.nextLine();

        return name;
    }

    private double getAmountFromUser()
    {
        double amount;
        do {
            System.out.print("Enter the Amount: ");
            amount = kb.nextDouble();
            kb.nextLine();

            if (amount < 0)
                System.out.println("Amount cannot be negative. Please try again.");

        } while(amount < 0);

        return amount;
    }

    private String getCategoryFromUser()
    {
        System.out.print("Enter the Category: ");
        String category = kb.nextLine();

        return category;
    }

    // adding expenses
    public void addExpense(Expense expense)
    {
        // creating a method to reference the expense to the tracker
        expenses.add(expense);
    }

    public void viewExpenses()
    {
        if (expenses.size() == 0) {
            System.out.println("You dont have any expenses yet.");
            System.out.println();
        }
        else {
            for (Expense expense : expenses) {
                //displaying the expenses fields
                System.out.println(expense);

            }
        }
    }

    public void createExpense()
    {
        String name = getNameFromUser();
        double amount = getAmountFromUser();
        String category = getCategoryFromUser();
        
        Expense expense = new Expense(name, amount, category);

        addExpense(expense);
    }

    public void deleteExpense()
    {
        System.out.println("What is the expense you want to delete ?");
        String expenseName = kb.nextLine();
        boolean delete = false;

        for (int i = 0; i < expenses.size(); i++)
        {
            Expense expense = expenses.get(i);
            if (expense.getName().equalsIgnoreCase(expenseName))
            {
                delete = true;
                expenses.remove(i);
                System.out.println("Expense has been deleted.");
                break;
            }
        }

        if (!delete)
            System.out.println("Expense not found. ");
    }

    public void calculateTotalSpending()
    {
        double total = 0;

        for (int i = 0; i < expenses.size(); i++)
        {
            Expense expense = expenses.get(i);
            total = total + expense.getAmount();
        }
        System.out.println("Your Total Spending: " + total);
    }

    public void searchByCategory()
    {
        System.out.println("What category would you like to search for ?");
        String searchByC = kb.nextLine();

        boolean found = false;

        for (int i = 0; i < expenses.size(); i++)
        {
            Expense expense = expenses.get(i);
            if (searchByC.equalsIgnoreCase(expense.getCategory()))
            {
                found = true;
                System.out.println(expense);
            }
        }

        if(!found)
        {
            System.out.println("No category found.");
        }
    }

    public void displayMenu()
    {
        System.out.println("");
        System.out.println("===========================");
        System.out.println("      FINANCE TRACKER      ");
        System.out.println("===========================");
        System.out.println("1. Add Expense   ");
        System.out.println("2. View Expense  ");
        System.out.println("3. Delete Expense");
        System.out.println("4. Total Spending");
        System.out.println("5. Search by Category");
        System.out.println("6. Exit");
        System.out.println("");

    }

    public void start()
    {
        int choice;
        do {

            displayMenu();
            System.out.print("Choose an option: ");
            choice = kb.nextInt();
            kb.nextLine();

            // switch loop for the menu
            switch(choice)
            {
                case 1:
                    System.out.println();
                    createExpense();
                    break;

                case 2:
                    System.out.println();
                    viewExpenses();
                    break;

                case 3:
                    System.out.println();
                    deleteExpense();
                    break;

                case 4:
                    System.out.println();
                    calculateTotalSpending();
                    break;

                case 5:
                    System.out.println();
                    searchByCategory();
                    break;

                case 6:
                    System.out.println();
                    System.out.println("Thank you for using Finance Tracker!");
                    break;

                default:
                    System.out.println("Invalid Option.");
            }

        }while(choice != 6);
    }

}
