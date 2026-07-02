package day02_conditionals;
import java.util.Scanner;
public class PassorFail
    {
        public static void main(String[] args)
        {
            Scanner kb = new Scanner(System.in);

            System.out.print("Enter your exam score:");
            int score = kb.nextInt();

            if (score >= 70)
                System.out.println("Congratulations. You passed!");
            else
                System.out.println("Sorry you failed.");
        }
    }

