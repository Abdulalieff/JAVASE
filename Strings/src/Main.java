import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.print("Enter String to check Polindrome: ");
        Scanner GetString = new Scanner(System.in);

        String mystr = GetString.nextLine();

        GetString.close();

        if(Utils.PalindromeChecker(mystr)) System.out.println(mystr + " is Polindrome");
        else System.out.println(mystr + " is not Polindrome");


    }
}