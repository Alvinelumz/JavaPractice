package day02_conditionals;

import java.util.Scanner;
public class GradeCalc {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        int score;

        do {
            System.out.print("Enter your score between 0-100: ");
            score = kb.nextInt();

            if(score < 0 || score > 100) {
                System.out.println("Invalid Score.");
            }
        } while(score < 0 || score > 100);

        if (score >= 90)
            System.out.println("A");
        else if (score >= 80)
            System.out.println("B");
        else if (score >= 70)
            System.out.println("C");
        else if (score >= 60)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
