import java.util.Arrays;

public class Utils {

    public static boolean checkAnagram(String var1, String var2){

        var1 = var1.replace("\\s","").toLowerCase();
        var2 = var2.replace("\\s","").toLowerCase();

        if(var1.length()  != var2.length()){
            return false;
        }

        char[] arrvar1 = var1.toCharArray();
        char[] arrvar2 = var2.toCharArray();

        Arrays.sort(arrvar1);
        Arrays.sort(arrvar2);

        return Arrays.equals(arrvar1, arrvar2);

    }

    public static void GetLargest(int[] Numbers) {

        int max= Numbers[0];
        int cnt_max = 0;
        for(int number : Numbers){
            if(max < number) {
                max = number;
                cnt_max = 1;
            }else if(max == number){
                cnt_max++;
            }
        }
        System.out.printf("Max Repeated %d times \n", cnt_max);
    }

}
