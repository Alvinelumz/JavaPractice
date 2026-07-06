package day04_methods;
import java.util.Scanner;
public class SmartCalculator {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int choice;
        double num1;
        double num2;

        do {
            displayMenu();

            System.out.print("\nSelect an option: ");
            choice = kb.nextInt();

            switch (choice) {
                case 1:

                    System.out.print("\nEnter your first number: ");
                    num1 = kb.nextDouble();

                    System.out.print("Enter your second number: ");
                    num2 = kb.nextDouble();

                    double answerAdd = add(num1, num2);
                    System.out.println(answerAdd);
                    break;

                case 2:

                    System.out.print("\nEnter your first number: ");
                    num1 = kb.nextDouble();

                    System.out.print("Enter your second number: ");
                    num2 = kb.nextDouble();

                    double answerSub = subtract(num1, num2);
                    System.out.println(answerSub);
                    break;

                case 3:

                    System.out.print("\nEnter your first number: ");
                    num1 = kb.nextDouble();

                    System.out.print("Enter your second number: ");
                    num2 = kb.nextDouble();

                    double answerMultiply = multiply(num1, num2);
                    System.out.println(answerMultiply);
                    break;

                case 4:

                    System.out.print("\nEnter your first number: ");
                    num1 = kb.nextDouble();

                    System.out.print("Enter your second number: ");
                    num2 = kb.nextDouble();

                    if (num2 == 0)
                        System.out.println("\nCannot be divided by 0");
                    else {
                        double answerDivide = divide(num1, num2);
                        System.out.println(answerDivide);
                    }
                    break;

                case 5:
                    System.out.println("You have exited the program.");
                    break;

                default:
                    System.out.println("Invalid menu option.");
            }
        } while(choice != 5);

    }

    public static void displayMenu()
    {
        System.out.println();
        System.out.println("======================");
        System.out.println("  SMART CALCULATOR");
        System.out.println("====================== \n");
        System.out.println("1. ADD");
        System.out.println("2. SUBTRACT");
        System.out.println("3. MULTIPLY");
        System.out.println("4. DIVIDE");
        System.out.println("5. EXIT");
    }

    public static double add( double num1, double num2)
    {
        return num1 + num2;
    }

    public static double subtract( double num1, double num2)
    {
        return num1 - num2;
    }

    public static double multiply( double num1, double num2)
    {
        return num1 * num2;
    }

    public static double divide( double num1, double num2)
    {
        return num1 / num2;
    }
}
