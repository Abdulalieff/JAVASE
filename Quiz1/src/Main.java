import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first phrase: ");
        String word1 = scanner.nextLine();

        System.out.println("Enter second phrase: ");
        String word2 = scanner.nextLine();

        if(Utils.checkAnagram(word1, word2)){
            System.out.printf("%s and %s are anagram", word1, word2);
        }else{
            System.out.printf("%s and %s are not anagram", word1, word2);
        }

    }
}