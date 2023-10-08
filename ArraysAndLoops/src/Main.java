// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] Numbers = {-1,-34,0,4,49,-55,-9,49,-7,4,7,8,55};

        // Get the largest value and repeats
        ArrayHomeWorks.GetLargest(Numbers);

        // Get the Reverse Array
        ArrayHomeWorks.GetReversArray(Numbers);

        // Sort Array
        for(int i=0;i<ArrayHomeWorks.SortArray(Numbers).length;i++){
            System.out.println(ArrayHomeWorks.SortArray(Numbers)[i]);

        }
        }

    }