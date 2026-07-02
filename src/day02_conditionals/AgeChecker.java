package day02_conditionals;

import java.util.Scanner;
public class AgeChecker {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = kb.nextInt();

        if (age >= 18)
            System.out.println("You are an ADULT!");
        else
            System.out.println("You are a MINOR!");

    }
}
