package day01_variables;
import java.util.*;
public class UserIntroduction {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("What is your name ? ");
        String name = kb.next();

        System.out.println("What is your age ? ");
        int age = kb.nextInt();

        System.out.println("Nice to meet you " + name + ". \nYou are " + age + " years old. ");
    }
}
