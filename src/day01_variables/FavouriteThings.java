package day01_variables;
import java.util.Scanner;
public class FavouriteThings {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("What is your favorite programming language ?");
        String pLang = kb.next();
        System.out.println("What is your favorite hobby?");
        String hobby = kb.next();
        System.out.println("What company would you like to work for ?");
        String company = kb.next();

        display(pLang,hobby,company);

    }

    public static void display(String pLang, String hobby, String company)
    {
        System.out.println("========== FAVOURITES ============");

        System.out.println("Programming Language : " + pLang);
        System.out.println("Hobby:               : " + hobby);
        System.out.println("Dream Company        : " + company);

        System.out.println("================================== ");
    }
}
