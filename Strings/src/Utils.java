public class Utils {

    public static boolean PalindromeChecker(String mystring) {
        mystring = mystring.replaceAll("\\s", "").toLowerCase();

        int leftread = 0;
        int rightread = mystring.length() - 1;

        while (leftread < rightread) {
            if (mystring.charAt(leftread) != mystring.charAt(rightread)) return false;
            leftread++;
            rightread--;
        }
        return true;
    }
}
