package day03_loops;

import java.util.*;
public class Number_Game {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        Random rand = new Random();

        int num;
        int rNumber = rand.nextInt(100) + 1;
        int count = 0;

        display();

        do {
            System.out.println("Enter your guess: ");
            num = kb.nextInt();


            if (num > 100 || num < 1)
            {
                System.out.println("Please enter a number between 1 to 100");
            }

            count++ ;

            if (rNumber == num) {
                System.out.println("Congratulations!");
                System.out.println("You guessed the number in " + count + " attempts.");
            }
            else if (num > rNumber) {
                System.out.println("TOO HIGH");

            } else
                System.out.println("TOO LOW");


        } while(rNumber != num);

        System.out.println("The secret number was " + rNumber);

    }
    public static void display(){
        System.out.println("=============================");
        System.out.println("       GUESS THE GAME ");
        System.out.println("=============================");
        System.out.println();
        System.out.println("I am thinking of a number between 1 and 100.");
    }


}
