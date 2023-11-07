import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //5. Write Java code for finding numbers of maximum element in array -> input [4,1,5,5,1,5] -> output 3
        int[] Numbers = {4,1,5,5,1,5};

        Utils.GetLargest(Numbers);


        //6. Writing Java code for checking word is anagram(a word or phrase made by transposing the letters of another word or phrase) or not -> input race,care -> output true
        //input -> test, code -> output false

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